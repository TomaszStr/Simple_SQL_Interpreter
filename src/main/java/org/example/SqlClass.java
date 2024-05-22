package org.example;

import java.util.ArrayList;
import java.util.List;

public class SqlClass extends SqlStatement {
    // annotations in the future
    public List<SqlColumn> columnList;

    public SqlClass(){
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
        return "\tpublic "+ name +"(){\n\t}\n";
    }

    void createClassFile(){

    }

}
