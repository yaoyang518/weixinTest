package study;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "((((&&EXTPARAM_STRING(strTest)==\"a\")||((EXTPARAM_STRING(strTest)IN\"b\"!))&&";
		getString(string);
		System.out.println(getString(string));
	}

	public static String getString(String s) {
		if (s.startsWith("(")) {
			s = s.substring(1);
			return getString(s);
		} else {
			return s;
		}
	}

}
