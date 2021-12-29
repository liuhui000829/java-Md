package com.company.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@SuppressWarnings("all")
public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类代理类对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        dao.add(1, 2);

    }
}

//创建代理对象代码
@SuppressWarnings("all")
class UserDaoProxy implements InvocationHandler {

    // 1.把创建的是谁的对象 把谁传递过来
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("方法之前执行" + method.getName() + " 创建的参数" + Arrays.toString(args));
        // 当前方法
        Object res = method.invoke(obj, args);
        // 方法之后
        System.out.println("之后执行" + obj);
        return res;
    }
}
