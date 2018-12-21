package demo29;

public class Demo29 {

	public static void main(String[] args) {
		Demo29 demo29 = new Demo29();
		int i=140;
		demo29.f(i);
		demo29.f(Integer.valueOf(i));
	}

	public void f(long a) {
		System.out.println("基本类型被调用");
	}

	public void f(Long a) {
		System.out.println("包装类型被调用");
	}

}
