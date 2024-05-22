package org.example;

import fromSQL.simpleSQLBaseVisitor;
import fromSQL.simpleSQLParser;

import java.util.ArrayList;
import java.util.List;

public class SimpleSQLParseTreeVisitor extends simpleSQLBaseVisitor<Void> {
    List<SqlStatement> statements;

    public SimpleSQLParseTreeVisitor(){
        statements = new ArrayList<>();
    }

    @Override
    public Void visitCreateTableStatement(simpleSQLParser.CreateTableStatementContext ctx) {
        SqlClass statement = new SqlClass();
        statement.name = ctx.tableName().getText();

        for(var col : ctx.columnDefinition()){
            SqlColumn variable = new SqlColumn();
            variable.columnName = col.columnName().getText();
            variable.setColumnType(col.dataType().getText());
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
        return null;
    }

    @Override
    public Void visitCreateDomainStatement(simpleSQLParser.CreateDomainStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitCreateTypeStatement(simpleSQLParser.CreateTypeStatementContext ctx) {
        return null;
    }
}
