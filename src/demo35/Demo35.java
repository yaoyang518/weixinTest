package demo35;

import java.util.ArrayList;
import java.util.List;

public class Demo35 {
	static List arrayList = new ArrayList();
	
	public static void main(String[] args) {
		arrayList.add("aaaa");
		arrayList.add(100);
		
		for(int i = 0; i< arrayList.size();i++){
			String item = (String)arrayList.get(i);
		}
	}

}
