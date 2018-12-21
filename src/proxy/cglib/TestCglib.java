package proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class TestCglib {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ((YunZhongYu)(new Meipo().getInstance(new YunZhongYu()))).findLove();

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(YunZhongYu.class);
		enhancer.setCallback(new Meipo());
		((YunZhongYu) (enhancer.create())).findLove();
	}

}
