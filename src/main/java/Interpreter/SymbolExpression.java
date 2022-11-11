package Interpreter;

import java.util.HashMap;

/**
 * 非终结符表达式
 */
public class SymbolExpression extends Expression {

    // 左右表达式，可以是值表达式，也可以是运算符表达式
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // 具体的实现由子类去实现。这里只提供默认实现
    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return 0;
    }
}
