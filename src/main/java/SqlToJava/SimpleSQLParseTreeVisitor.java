package SqlToJava;

import ANTLRGenerated.simpleSQLBaseVisitor;
import ANTLRGenerated.simpleSQLParser;
import SqlToJava.Constraints.*;
import SqlToJava.Statements.SqlClass;
import SqlToJava.Statements.SqlColumn;
import SqlToJava.Statements.SqlEnum;
import SqlToJava.Statements.SqlStatement;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;

public class SimpleSQLParseTreeVisitor extends simpleSQLBaseVisitor<Void> {
    List<SqlStatement> statements;

    private String capitalize(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
    public SimpleSQLParseTreeVisitor(){
        statements = new ArrayList<>();
    }

    @Override
    public Void visitCreateTableStatement(simpleSQLParser.CreateTableStatementContext ctx) {
        SqlClass statement = new SqlClass(capitalize(ctx.tableName().getText()));

        for(var col : ctx.columnDefinition()){
            SqlColumn variable = new SqlColumn(col.columnName().getText(), col.dataType().getText());

            if(col.keyConstraint() != null){
                if(col.keyConstraint().foreignKeyConstraint() != null) {
                    String tableName = col.keyConstraint().foreignKeyConstraint().IDENTIFIER(0).getText();
                    String colName = variable.columnName;//col.keyConstraint().foreignKeyConstraint().IDENTIFIER(1) != null ? col.keyConstraint().foreignKeyConstraint().IDENTIFIER(1).getText() : "";
                    variable.setForeignKey(new SqlForeign(
                            tableName,
                            colName));
                } else if(col.keyConstraint().primaryKeyConstraint() != null)
                    variable.setPrimaryKey(new SqlPrimary());
            }

            for(var constr : col.columnConstraints()){
                addConstraint(variable, constr);
            }

            statement.columnList.add(variable);
        }

        if(ctx.foreignKeyDefinition() != null) {
            List<String> referenceNames = ctx.foreignKeyDefinition().columnName().stream().map(columnNameContext -> columnNameContext.IDENTIFIER().getText()).toList();
//            for(String name : referenceNames) {
//                System.out.println(name);
//                System.out.println(statement.columnList);
//                if (statement.columnList.stream().noneMatch(sqlColumn -> sqlColumn.columnName.equals(name)))
//                    throw new RuntimeException("Unknown column name in foreign key definition: "+name);
//            }
            if(ctx.foreignKeyDefinition().columnName().size() == 1){
                statement.columnList
                        .stream()
                        .filter((SqlColumn col)-> col.columnName.equals(ctx.foreignKeyDefinition().columnName(0).getText()))
                        .findFirst()
                        .get()
                        .setForeignKey(new SqlForeign(
                                ctx.foreignKeyDefinition().tableName().getText(),
                                ctx.foreignKeyDefinition().columnName(0).getText()));
            }
            //COMPOSITE FOREIGN KEY
            else{

            }
        }

        if(ctx.primaryKeyDefinition() != null){
            List<String> referenceNames = ctx.primaryKeyDefinition().columnName()
                    .stream()
                    .map(columnNameContext -> columnNameContext.IDENTIFIER().getText())
                    .toList();
            statement.columnList.forEach(sqlColumn ->{
                if(referenceNames.contains(sqlColumn.columnName)){
                    sqlColumn.setPrimaryKey(new SqlPrimary());
                }
            });
        }

        statements.add(statement);
        return null;
    }

    @Override
    public Void visitCreateEnumStatement(simpleSQLParser.CreateEnumStatementContext ctx) {
        SqlEnum sqlEnum = new SqlEnum(capitalize(ctx.enumName().getText()));

        for(var enumVal : ctx.enumValue()){
            String enumValName = enumVal.getText().substring(1,enumVal.getText().length()-1);
            sqlEnum.enumElements.add(capitalize(enumValName));
        }

        statements.add(sqlEnum);
        return null;
    }

    @Override
    public Void visitCreateDomainStatement(simpleSQLParser.CreateDomainStatementContext ctx) {
        SqlClass statement = new SqlClass(capitalize(ctx.domainName().getText()));
        SqlColumn variable = new SqlColumn(ctx.domainName().getText(), ctx.dataType().getText());
        for(var constr : ctx.domainConstraints()){
            addConstraint(variable, constr);
        }
        statement.columnList.add(variable);
        statements.add(statement);
        return null;
    }

    @Override
    public Void visitCreateTypeStatement(simpleSQLParser.CreateTypeStatementContext ctx) {
        SqlClass statement = new SqlClass(capitalize(ctx.typeName().getText()));

        for(var col : ctx.fieldDefinition()){
            SqlColumn variable = new SqlColumn(col.columnName().getText(), col.dataType().getText());
            statement.columnList.add(variable);
        }

        statements.add(statement);
        return null;
    }

    private void addConstraint(SqlColumn variable, simpleSQLParser.ColumnConstraintsContext constr){
        if(constr.checkConstraint() != null) {
            variable.setCheckConstraint(new SqlCheck(constr.checkConstraint().expression().getText()));
        }
        else if (constr.defaultConstraint() != null) {
            variable.setDefaultConstraint(new SqlDefault(constr.defaultConstraint().defaultValue().getText()));
        }
        else if (constr.notNullConstraint() != null){
            variable.setNotNullConstraint(new SqlNotNull());
        }
        else if (constr.uniqueConstraint() != null) {
            variable.setUniqueConstraint(new SqlUnique());
        }
    }

    private void addConstraint(SqlColumn variable, simpleSQLParser.DomainConstraintsContext constr){
        if(constr.checkConstraint() != null) {
            variable.setCheckConstraint(new SqlCheck(constr.checkConstraint().expression().getText()));
        }
        else if (constr.defaultConstraint() != null) {
            variable.setDefaultConstraint(new SqlDefault(constr.defaultConstraint().defaultValue().getText()));
        }
        else if (constr.notNullConstraint() != null){
            variable.setNotNullConstraint(new SqlNotNull());
        }
        else if (constr.uniqueConstraint() != null) {
            variable.setUniqueConstraint(new SqlUnique());
        }
    }
}
