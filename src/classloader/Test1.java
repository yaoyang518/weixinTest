package classloader;

import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//new Test().hello();
		MyClassLoader classLoader = new MyClassLoader("D:");
		Class clazz = classLoader.loadClass("classloader.Test");
		Object obj = clazz.newInstance();
		Method helloMethod = clazz.getDeclaredMethod("hello", null);
		helloMethod.invoke(obj, null);
	}

}
