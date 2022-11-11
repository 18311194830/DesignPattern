package Interpreter;

import java.util.HashMap;

/**
 * 非终结符表达式--加法表达式
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 进行加法运算符操作。如果运算符左右两边是值表达式，则从HashMap获取值相加
    // 如果是运算符表达式，则递归调用
    public int interpreter(HashMap<String, Integer> map) {
        return super.left.interpreter(map) + super.right.interpreter(map);
    }
}
