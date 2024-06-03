package SqlToJava.Constraints;

public class SqlUnique extends SqlConstraint{
    public SqlUnique(){
        type = ConstraintType.UNIQUE;
    }
}
