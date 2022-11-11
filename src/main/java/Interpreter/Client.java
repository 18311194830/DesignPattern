package Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        // 例如：expStr = a+b-c
        String expStr = getExpStr();
        // 例如：inputMap = {a=10, b=30, c=20}
        HashMap<String, Integer> inputMap = getInputMap(expStr);
        // 进行计算器表达式的构造
        Calculator calculator = new Calculator(expStr);
        // 将inputMap传入计算器表达式，进行计算
        System.out.println("运算结果：" + expStr + " = " + calculator.run(inputMap));
    }

    // 获取用户输入的字符串表达式
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    // 获得用户输入的字符串表达式，各个变量及其值HashMap
    public static HashMap<String, Integer> getInputMap(String expStr) throws IOException {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-' && ch != ' ') {
                // hashMap右的变量则不处理
                if (!hashMap.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + String.valueOf(ch) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    hashMap.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return hashMap;
    }
}
