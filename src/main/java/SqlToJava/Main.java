package SqlToJava;

import ANTLRGenerated.simpleSQLLexer;
import ANTLRGenerated.simpleSQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //smth();
        consoleProgram();
    }

    static void consoleProgram(){
        Program program = new Program();
        program.run();
    }

    public static void smth() {
        String sqlFile = "src/main/resources/sql_examples/example1.sql";
        String fileDestination = "out/";
        CharStream input = null;
        try {
            input = CharStreams.fromFileName(sqlFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        simpleSQLLexer lexer = new simpleSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simpleSQLParser parser = new simpleSQLParser(tokens);

        ParseTree tree = parser.startRule();

        SimpleSQLParseTreeVisitor visitor = new SimpleSQLParseTreeVisitor();
        visitor.visit(tree);

        for(SqlStatement statement : visitor.statements){
            System.out.println(statement.name + " will be saved to file.");
            statement.saveToFile(fileDestination);
            //System.out.println(statement.generateClassCode());
        }
    }
}