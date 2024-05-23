package SqlToJava;

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
                .append("class ")
                .append(name)
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
        constructorBuilder
                .append("\tpublic ")
                .append(name)
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
