package demo22;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Demo22 {

	public static void main(String[] args) {
		System.out.println(10 - 9.6);
		NumberFormat format = new DecimalFormat("#.##");
		System.out.println(format.format(10-9.6));
	}

}
