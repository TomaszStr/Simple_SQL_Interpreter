package SqlToJava.Statements;

import java.util.ArrayList;
import java.util.List;

public class SqlEnum extends SqlStatement{
    public List<String> enumElements;
    public SqlEnum(String name){
        this.name = name;
        enumElements = new ArrayList<>();
    }

    @Override
    public String generateClassCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder
                .append("enum ")
                .append(name)
                .append(" {\n");

//        for(String element : enumElements){
//            codeBuilder
//                    .append("\t")
//                    .append(element, 1, element.length()-1)
//                    .append("\n");
//        }
        codeBuilder
                .append("\t")
                .append(String.join(",\n\t",enumElements))
                .append(";\n");

        codeBuilder.append("}");
        return codeBuilder.toString();
    }
}
