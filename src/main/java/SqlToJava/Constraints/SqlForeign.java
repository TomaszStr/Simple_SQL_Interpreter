package SqlToJava.Constraints;

public class SqlForeign extends SqlConstraint{
    public String tableName;
    public String columnName;
    public SqlForeign(String tableName, String columnName){
        type = ConstraintType.FOREIGN;
        this.tableName = tableName;
        this.columnName = columnName;
    }
}
