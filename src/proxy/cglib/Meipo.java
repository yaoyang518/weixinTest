package proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class Meipo implements MethodInterceptor {

	public Object getInstance(Object obj) throws Exception {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] arg2, MethodProxy proxy) throws Throwable {
		System.out.println("我是媒婆");
		proxy.invokeSuper(obj, arg2);
		return null;
	}

}
