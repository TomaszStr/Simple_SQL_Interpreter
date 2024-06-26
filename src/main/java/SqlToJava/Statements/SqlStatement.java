package SqlToJava.Statements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class SqlStatement {

    public String name;
    public abstract String generateClassCode();
    String capitalize(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
    public void saveToFile(String filePath) {
        String fileName = filePath+capitalize(name)+".java";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(generateClassCode());
            writer.close();
        }
        catch (IOException e){e.printStackTrace();}
    }
}
