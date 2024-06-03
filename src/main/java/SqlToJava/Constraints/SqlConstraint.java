package SqlToJava.Constraints;

abstract class SqlConstraint {

    ConstraintType type;
    public SqlConstraint(){
    }

    public ConstraintType getType() {
        return type;
    }
}

