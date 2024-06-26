package SqlToJava.Statements;

import java.util.ArrayList;
import java.util.List;

public class SqlClass extends SqlStatement {
    public List<SqlColumn> columnList;

    public SqlClass(String name){
        this.name = name;
        columnList = new ArrayList<>();
    }

    @Override
    public String generateClassCode(){
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder
                .append("import jakarta.persistence.*;\n\n")
                .append("@Entity\n")
                .append("@Table(name = \"").append(name).append("\")\n")
                .append("class ")
                .append(capitalize(name))
                .append(" {\n");

        for(SqlColumn column : columnList){
            codeBuilder.append(column.generateCode());
        }

        codeBuilder.append(generateConstructors());

        for(SqlColumn column : columnList){
            codeBuilder.append(column.generateSetter());
        }

        for(SqlColumn column : columnList){
            codeBuilder.append(column.generateGetter());
        }

        codeBuilder.append("}");
        return codeBuilder.toString();
    }

    private String generateConstructors() {
        StringBuilder constructorBuilder = new StringBuilder();
        // No args constructor
        constructorBuilder
                .append("\tpublic ")
                .append(capitalize(name))
                .append("(){}\n");
        // All args constructor
        constructorBuilder
                .append("\tpublic ")
                .append(capitalize(name))
                .append("(");

        constructorBuilder.append(
            String.join(",",
            columnList.stream()
                .map((sqlColumn -> sqlColumn.columnType+" "+sqlColumn.columnName))
                .toList())
        );

        constructorBuilder.append("){\n\t\t");

        constructorBuilder.append(
                String.join(";\n\t\t",
                        columnList.stream()
                                .map((sqlColumn -> "this."+sqlColumn.columnName+" = "+sqlColumn.columnName))
                                .toList())
        );

        constructorBuilder.append(";\n\t}\n");

        return constructorBuilder.toString();
    }
}
