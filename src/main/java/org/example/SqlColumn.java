package org.example;

import java.util.List;

public class SqlColumn {
    String columnName;
    String columnType;
    List<SqlConstraint> constraintList;
    public void setColumnType(String type){
        switch (type) {
            case "INTEGER":
            case "INT":
                columnType = "int";
                break;
            case "DOUBLE":
                columnType = "double";
                break;
            case "FLOAT":
                columnType = "float";
                break;
            case "DATE":
                columnType = "DateTime";
                break;
            case "BOOLEAN":
                columnType = "boolean";
                break;
            case "TEXT":
                columnType = "String";
                break;
            default:
                if(type.matches("VARCHAR\\(\\d+\\)"))
                    columnType = "String";
        }
    }
    String generateCode(){
        return "\t"+columnType+" "+columnName+";\n";
    }
    String generateGetter(){
        return "\tpublic "+columnType+" get"+columnName+"(){\n"
                +"\t\treturn "+columnName+";\n"
                +"\t}\n";
    }
    String generateSetter(){
        return "\tpublic "+columnType+" set"+columnName+"("+columnName+"){\n"
                +"\t\tthis."+columnName+" = "+columnName+";\n"
                +"\t}\n";
    }
}
