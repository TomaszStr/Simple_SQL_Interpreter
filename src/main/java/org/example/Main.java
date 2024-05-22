package org.example;

import fromSQL.simpleSQLLexer;
import fromSQL.simpleSQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
//        String sql = "CREATE TABLE Users (id INT, name VARCHAR(255));";
//        simpleSQLLexer lexer = new simpleSQLLexer(CharStreams.fromString(sql));
//        simpleSQLParser parser = new simpleSQLParser(new CommonTokenStream(lexer));
//
//        try {
//            parser.statement();
//        } catch (RecognitionException e) {
//            e.printStackTrace();
//        }

        // Załaduj plik SQL
        String sqlFile = "src/main/resources/sql_examples/example1.sql";
        CharStream input = null;
        try {
            input = CharStreams.fromFileName(sqlFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Utwórz lexer i parser
        simpleSQLLexer lexer = new simpleSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simpleSQLParser parser = new simpleSQLParser(tokens);

        // Parsuj plik SQL
        ParseTree tree = parser.startRule();

        // Odwiedź drzewo parsowania
        SimpleSQLParseTreeVisitor visitor = new SimpleSQLParseTreeVisitor();
        visitor.visit(tree);

        List<String> code = new ArrayList<>();
        for(SqlStatement statement : visitor.statements){
            System.out.println(statement.name + " will be saved to file.");
            System.out.println(statement.generateClassCode());
            code.add(statement.generateClassCode());
        }
    }
}