package Interpreter;

import java.util.HashMap;

/**
 * 抽象表达式
 */
public abstract class Expression {

    //由子类进行具体的实现
    //如果是变量表达式子类，则从HashMap通过Key获取值
    //如果是运算符表达式子类，则进行运算符操作。如果运算符左右两边还是运算符表达式，则递归调用
    public abstract int interpreter(HashMap<String,Integer> map);
}
