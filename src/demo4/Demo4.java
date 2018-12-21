package demo4;

import java.text.NumberFormat;

public class Demo4 {

	public static void main(String[] args) {
		Demo4 demo4 = new Demo4();
		demo4.calPrice(49900);

	}

	private String formateCurrency(float price) {
		return NumberFormat.getCurrencyInstance().format(price / 100);
	}

	public void calPrice(int price, int discount) {
		float knockdownPrice = price * discount / 100.0F;
		System.out.println("简单折扣后的价格是：" + formateCurrency(knockdownPrice));
	}

	public void calPrice(int price, int... discounts) {
		float knockdownPrice = price;
		for (int discount : discounts) {
			knockdownPrice = knockdownPrice * discount / 100F;
		}
		System.out.println("复杂折扣后的价格是：" + formateCurrency(knockdownPrice));
	}

}
