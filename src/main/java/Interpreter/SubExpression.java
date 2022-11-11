package Interpreter;

import java.util.HashMap;

//非终结符表达式具体实现-减法表达式
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> map) {
        return super.left.interpreter(map) - super.right.interpreter(map);
    }
}
