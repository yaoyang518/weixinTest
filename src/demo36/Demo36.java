package demo36;

public class Demo36 {

	public static void main(String[] args) {
		Generic<Integer> genericInteger = new Generic<Integer>(1234565);

		// 传入的实参类型需与泛型的类型参数类型相同，即为String.
		Generic<String> genericString = new Generic<String>("1234");

		Generic generic = new Generic("111111");
		Generic generic1 = new Generic(4444);
		Generic generic2 = new Generic(55.55);
		Generic generic3 = new Generic(false);

		System.out.println(
				generic.getData() + ":" + generic1.getData() + ":" + generic2.getData() + ":" + generic3.getData());

	}

	public <T> T genericMethod(Class<T> tClass) throws InstantiationException, IllegalAccessException {
		T instance = tClass.newInstance();
		return instance;
	}
}
