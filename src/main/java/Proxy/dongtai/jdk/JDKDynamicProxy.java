package Proxy.dongtai.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {

    /**
     * 反射代理目标类
     */
    private Object target;

    /**
     * 通过构造器动态设置被代理目标类，以便于调用指定方法
     * @param subject
     */
    public JDKDynamicProxy(Object subject){
        this.target = subject;
    }

    /**
     * 代理过程中的扩展点
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("wakeup")){
            System.out.println("早安~~~");
        }else if(methodName.equals("sleep")){
            System.out.println("晚安~~~");
        }
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
