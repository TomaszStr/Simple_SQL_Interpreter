package SqlToJava;

import ANTLRGenerated.simpleSQLLexer;
import ANTLRGenerated.simpleSQLParser;
import SqlToJava.Statements.SqlStatement;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    boolean continueProgram = true;
    String outPath = "out/";

    Scanner scanner;

    simpleSQLLexer lexer;
    CommonTokenStream tokens;
    simpleSQLParser parser;
    ParseTree tree;
    SimpleSQLParseTreeVisitor visitor = new SimpleSQLParseTreeVisitor();

    void run(){
        scanner = new Scanner(System.in);
        String command;

        System.out.println("Where would you like to store created files, by default out/");
        command = scanner.nextLine();
        outPath = command.isEmpty()? outPath : command;

        while(continueProgram){
            System.out.println("=".repeat(20));
            System.out.println("Would you like to convert from file or from console?\nWrite file! or console!\nTo end program write end!");
            command = scanner.nextLine();
            handleCommand(command);
        }

        scanner.close();
    }
    void handleCommand(String command){
        switch (command){
            case "file!":
                fromFile();
                break;
            case "console!":
                fromConsole();
                break;
            case "end!":
                continueProgram = false;
                System.out.println("Program finished");
                break;
            default:
                System.out.println("Unknown command, available commands are : file!, console!");
                break;
        }
    }

    void fromFile(){
        System.out.println("Insert file path");
        String filePath = scanner.nextLine();
        CharStream input = null;
        try {
            input = CharStreams.fromFileName(filePath);
        } catch (IOException e) {
            System.out.println("There was a problem reading from file: "+e.getMessage());
        }
        createFiles(input);
    }

    void fromConsole(){
        StringBuilder commandBuilder = new StringBuilder();
        String input;
        System.out.println("Insert sql script!, to finish insert end!");
        input = scanner.nextLine();
        while(!input.equals("end!")){
            commandBuilder.append(input);
            input = scanner.nextLine();
        }
        createFiles(CharStreams.fromString(commandBuilder.toString()));
    }

    void createFiles(CharStream charStream){
        lexer = new simpleSQLLexer(charStream);
        tokens = new CommonTokenStream(lexer);
        parser = new simpleSQLParser(tokens);
        tree = parser.startRule();
        visitor = new SimpleSQLParseTreeVisitor();

        try {
            visitor.visit(tree);
        }
        catch (Exception e){
            System.out.println("There was a problem while translating: "+e.getMessage());
        }

        for(SqlStatement statement : visitor.statements){
                statement.saveToFile(outPath);
        }
    }
}
