package Interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    //计算器要进行计算的表达式
    private Expression expression;

    //解析传入的字符串表达式
    public Calculator(String expStr) {
        //定义一个堆栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分为字符串数组
        char[] chars = expStr.toCharArray();
        //用于存放临时的左右表达式
        Expression left = null;
        Expression right = null;
        //遍历字符串数组，根据不同的情况做不同的处理
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    //从栈中获取临时的计算表达式，赋值给临时的左表达式
                    left = stack.pop();
                    //运算符后面的空字符串直接跳过
                    while (String.valueOf(chars[++i]) == "") {

                    }
                    // 将运算符后面的变量，构造成值表达式，然后赋值给临时的右表达式
                    right = new VarExpression(String.valueOf(chars[i]));
                    // 根据左右表达式构造出加法表达式，作为临时的计算器表达式传入栈中
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    while (String.valueOf(chars[++i]) == " ") {

                    }
                    right = new VarExpression(String.valueOf(chars[i]));
                    stack.push(new SubExpression(left, right));
                    break;
                case ' ':
                    break;
                default:
                    // 剩余的就是变量，构造成值表达式，作为临时的计算器表达式传入栈中
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        // 当遍历完整个charArray数组后，从栈中获取计算器表达式
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> inputMap) {

        // 将用户输入的表达式的值HashMap，传入给计算器表达式进行计算
        return this.expression.interpreter(inputMap);
    }
}
