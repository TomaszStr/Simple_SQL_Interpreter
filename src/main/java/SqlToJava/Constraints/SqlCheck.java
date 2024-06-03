package SqlToJava.Constraints;

public class SqlCheck extends SqlConstraint{
    String condition;

    public SqlCheck(String condition){
        type = ConstraintType.CHECK;
        this.condition = condition;
    }
}
