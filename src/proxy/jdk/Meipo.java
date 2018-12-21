package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements InvocationHandler {

	private Person target;

	public Meipo() {
		super();
	}

	public Meipo(Person target) {
		super();
		this.target = target;
	}

	// 获取被代理人的个人资料
	// 返回代理对象
	Object getInstance(Person _target) {
		target = _target;
		Class clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我被调用了");
		System.out.println("——————");
		// this.target.findLove();
		method.invoke(target, args);
		System.out.println("——————");
		return null;
	}

}
