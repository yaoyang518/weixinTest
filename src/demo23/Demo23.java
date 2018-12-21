package demo23;

public class Demo23 {

	public static void main(String[] args) {
		System.out.println(Level.COMMON.getIndex());
		System.out.println(Level.COMMON.ordinal());
		Level level = Level.valueOf("COMMON");
		System.out.println(level.getName());
	}

}
