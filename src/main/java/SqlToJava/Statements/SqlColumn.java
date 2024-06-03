package SqlToJava.Statements;

import SqlToJava.Constraints.*;

public class SqlColumn {
    public String columnName;
    public String columnType;
    SqlPrimary primaryKey = null;
    SqlForeign foreignKey = null;
    SqlDefault defaultConstraint = null;
    SqlNotNull notNullConstraint = null;
    SqlCheck checkConstraint = null;
    SqlUnique uniqueConstraint = null;

    public SqlColumn(String name,String type){
        columnName = name;
        setColumnType(type);
    }
    public void setPrimaryKey(SqlPrimary primaryKey){
        if(this.primaryKey != null)
            throw new RuntimeException("column cannot be assigned as primary key twice: " + columnName);
        this.primaryKey = primaryKey;
    }
    public void setForeignKey(SqlForeign foreignKey){
        if(this.foreignKey != null)
            throw new RuntimeException("column cannot be assigned as foreign key twice: " + columnName);
        this.foreignKey = foreignKey;
        this.columnType = capitalize(foreignKey.tableName);
    }
    public void setDefaultConstraint(SqlDefault defaultConstraint){
        if(this.defaultConstraint != null)
            throw new RuntimeException("Column cannot have multiple default values: " + columnName);
        assignDefaultConstraint(defaultConstraint);
    }

    private void assignDefaultConstraint(SqlDefault defaultConstraint) {
        switch (columnType) {
            case "String":
                if (!defaultConstraint.defaultValue.matches("^'.*'$"))
                    throw new RuntimeException("Invalid String default value at column: " + columnName + ", value: " + defaultConstraint.defaultValue);
                int len = defaultConstraint.defaultValue.length();
                this.defaultConstraint = new SqlDefault("\"" + defaultConstraint.defaultValue.substring(1, len - 1) + "\"");
                break;
            case "boolean":
                if (!defaultConstraint.defaultValue.equals("TRUE") && !defaultConstraint.defaultValue.equals("FALSE"))
                    throw new RuntimeException("Invalid boolean default value at column: " + columnName + ", value: " + defaultConstraint.defaultValue);
                this.defaultConstraint = new SqlDefault(defaultConstraint.defaultValue.toLowerCase());
                break;
            case "int":
                if (!defaultConstraint.defaultValue.matches("^\\d+$"))
                    throw new RuntimeException("Invalid int default value at column: " + columnName + ", value: " + defaultConstraint.defaultValue);
                else
                    this.defaultConstraint = defaultConstraint;
                break;
            case "double":
            case "float":
                if (!defaultConstraint.defaultValue.matches("^\\d+(\\.\\d*)?$"))
                    throw new RuntimeException("Invalid double default value at column: " + columnName + ", value: " + defaultConstraint.defaultValue);
                else
                    this.defaultConstraint = defaultConstraint;
                break;
        }


    }

    public void setNotNullConstraint(SqlNotNull notNullConstraint){
        if(this.notNullConstraint != null)
            throw new RuntimeException("Column cannot have multiple NOT NULL constraints: " + columnName);
        this.notNullConstraint = notNullConstraint;
    }
    public void setCheckConstraint(SqlCheck checkConstraint){
        if(this.checkConstraint != null)
            throw new RuntimeException("Column cannot have multiple check constraints: " + columnName);
        this.checkConstraint = checkConstraint;
    }
    public void setUniqueConstraint(SqlUnique uniqueConstraint){
        if(this.primaryKey != null)
            throw new RuntimeException("Column cannot have multiple unique constraints: " + columnName);
        this.uniqueConstraint = uniqueConstraint;
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
                    columnType = capitalize(type);
                    //throw new IllegalArgumentException("Unknown SQL type: " + type);
        }
    }
    String generateCode(){
        StringBuilder codeBuilder = new StringBuilder();
        if(primaryKey != null){
            if(primaryKey.getType() == ConstraintType.PRIMARY){
                codeBuilder.append("\t@Id\n");
            }
        }

        if(foreignKey != null){
            codeBuilder.append("\t@ManyToOne\n");
            codeBuilder.append("\t@JoinColumn(name = \"").append(foreignKey.columnName).append("\"");
        }
        else{
            codeBuilder.append("\t@Column(name = \"").append(columnName).append("\"");
        }

        if(notNullConstraint != null)
            codeBuilder.append(" ,nullable = false");
        if(uniqueConstraint != null)
            codeBuilder.append(" ,unique = true");
        codeBuilder.append(")\n");

        codeBuilder.append("\tprivate ").append(columnType).append(" ").append(columnName);
        if(defaultConstraint != null)
            codeBuilder.append(" = ").append(defaultConstraint.defaultValue);
        codeBuilder.append(";\n");

        return codeBuilder.toString();
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
