package SqlToJava.Constraints;

public class SqlNotNull extends SqlConstraint{
    public SqlNotNull(){
        type = ConstraintType.NOTNULL;
    }
}
