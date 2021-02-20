package dass.com.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression {

    private String key; // a, b, c, d
    public VarExpression(String _key){
        this.key = _key;
    }
    //从map中提取变量的值
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
