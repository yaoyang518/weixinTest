package proxy.jdk;

public class TestFindLove {

	public static void main(String[] args) {
		XiaoXingXing xiaoXingXing = new XiaoXingXing();
		// xiaoXingXing.findLove();
		Person person = (Person) new Meipo().getInstance(new XiaoXingXing());
		person.findLove();
		//((Person)(Proxy.newProxyInstance(xiaoXingXing.getClass().getClassLoader(), xiaoXingXing.getClass().getInterfaces(), new Meipo(xiaoXingXing)))).findLove();
		
	}

}
