package SqlToJava;

import ANTLRGenerated.simpleSQLBaseVisitor;
import ANTLRGenerated.simpleSQLParser;

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
            for(var constr : col.columnConstraints()){
                SqlConstraint constraint = new SqlConstraint();
            }
            statement.columnList.add(variable);
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
        SqlColumn domain = new SqlColumn(ctx.domainName().getText(), ctx.dataType().getText());
        for(var constr : ctx.domainConstraints()){
            domain.constraintList.add(new SqlConstraint());
        }
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
}
