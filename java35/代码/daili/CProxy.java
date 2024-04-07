package daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CProxy {
    public static Star creatProxy(JG star){
        Star ss = (Star) Proxy.newProxyInstance(CProxy.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if("sing".equals(star.getName())){
                    System.out.println("准备话筒，收钱");
                }else if("dance".equals(star.getName())){
                    System.out.println("准备场地，收钱");
                }
                return method.invoke(star,args);
            }
        });
        return ss;
    }

}
