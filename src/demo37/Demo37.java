package demo37;

public class Demo37 {

	public static void main(String[] args) {
		int n = 16 - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		System.out.println(n);
		System.out.println((n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1);
		System.out.println(-1 >= 1 >> 30);
		System.out.println(Byte.parseByte("11", 5));
		
	}
}
