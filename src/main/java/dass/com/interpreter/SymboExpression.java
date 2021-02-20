package dass.com.interpreter;

public abstract class SymboExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymboExpression(Expression _left,Expression _right)
    {
        this.left=_left;
        this.right=_right;
    }
}
