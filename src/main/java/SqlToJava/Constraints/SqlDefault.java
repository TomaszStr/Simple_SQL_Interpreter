package SqlToJava.Constraints;

public class SqlDefault extends SqlConstraint{
    public String defaultValue;
    public SqlDefault(String defaultValue){
        type = ConstraintType.DEFAULT;
        this.defaultValue = defaultValue;
    }
}
