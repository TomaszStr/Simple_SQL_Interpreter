package SqlToJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class SqlStatement {

    public String name;
    public abstract String generateClassCode();
    public void saveToFile(String filePath) {
        String fileName = filePath+name+".java";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(generateClassCode());
            writer.close();
        }
        catch (IOException e){e.printStackTrace();}
    }
}
