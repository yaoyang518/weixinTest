package demo6;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Sub();
		base.fun(100, 50);
		Sub sub = new Sub();
		// sub.fun(100, 50);
	}

}

class Base {
	void fun(int price, int... discounts) {
		System.out.println("Base......fun");
	}
}

class Sub extends Base {
	@Override
	void fun(int price, int[] discounts) {
		System.out.println("Sub......fun");
	}
}
