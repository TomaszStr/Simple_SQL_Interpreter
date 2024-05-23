package SqlToJava;

import java.util.ArrayList;
import java.util.List;

public class SqlColumn {
    String columnName;
    String columnType;
    List<SqlConstraint> constraintList;

    public SqlColumn(String name,String type){
        columnName = name;
        setColumnType(type);
        constraintList = new ArrayList<>();
    }
    void setColumnType(String type){
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
                else
                    throw new IllegalArgumentException("Unknown SQL type: " + type);
        }
    }
    String generateCode(){
        return "\tprivate "+columnType+" "+columnName+";\n";
    }
    String generateGetter(){
        return "\tpublic "+columnType+" get"+capitalize(columnName)+"(){\n"
                +"\t\treturn "+columnName+";\n"
                +"\t}\n";
    }
    String generateSetter(){
        return "\tpublic void set"+capitalize(columnName)+"("+columnType+" "+columnName+"){\n"
                +"\t\tthis."+columnName+" = "+columnName+";\n"
                +"\t}\n";
    }
    private String capitalize(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}
