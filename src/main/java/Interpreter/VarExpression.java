package Interpreter;

import java.util.HashMap;

/**
 * 终结符表达式
 */
public class VarExpression extends Expression{

    private String key;

    public VarExpression(String key){
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return map.get(this.key);
    }
}
