package Proxy.dongtai.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    //可以通过Enhancer对象中的create()方法可以去生成一个类，用于生成代理对象
    private Enhancer enhancer = new Enhancer();

    private Object target;

    public CglibProxy(Object subject) {
        this.target = subject;
    }

    public Object getProxy(){
        //设置父类(将目标类作为代理类的父类)
        enhancer.setSuperclass(target.getClass());
        //设置拦截器(回调对象为本身对象)
        enhancer.setCallback(this);
        //生成一个代理类对象并返回给调用着
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("wakeup")){
            System.out.println("早安~~~");
        }else if(methodName.equals("sleep")){
            System.out.println("晚安~~~");
        }
        return method.invoke(target,objects);
    }
}
