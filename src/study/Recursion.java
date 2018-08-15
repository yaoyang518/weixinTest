package study;

public class Recursion {

	public static String getString(String s) {
		if (s.startsWith("(")) {
			s = s.substring(1);
			return getString(s);
		} else {
			return s;
		}
	}


	// 1.递归求和1+2+3+.....+n
	public static int getSum(int n) {
		if (n > 0) {
			return n + getSum(n - 1);
		} else {
			return 0;
		}
	}
	
	//2.递归阶乘n! = n * (n-1) * (n-2) * ...* 1(n>0)
	public static int getFactorial(int n) {
		if (n > 0) {
			return n * getFactorial(n - 1);
		} else {
			return 1;
		}
	}
	

	public static void main(String[] args) {
		// String string =
		// "((((&&EXTPARAM_STRING(strTest)==\"a\")||((EXTPARAM_STRING(strTest)IN\"b\"!))&&";
		// getString(string);
		//getSum(5);
		
		System.out.println(getFactorial(5));
	}
}
