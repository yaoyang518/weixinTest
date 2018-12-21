package demo31;

public class Demo31 {

	public static void main(String[] args) {
		/*
		 * Person f = new Person("父亲"); Person s1 = new Person("大儿子", f); Person
		 * s2 = s1.clone(); s2.setName("小儿子"); Person gf = new Person("干爹");
		 * s1.setFather(gf);;
		 * System.out.println(s1.getName()+"的父亲是"+s1.getFather().getName());
		 * System.out.println(s2.getName()+"的父亲是"+s2.getFather().getName());
		 */

		StringBuffer sBuffer = new StringBuffer();
		StringBuilder sBuilder = new StringBuilder();
	}

}

class Person implements Cloneable {
	private String name;
	private Person father;

	public Person(String _name) {
		name = _name;
	}

	public Person(String _name, Person _parent) {
		name = _name;
		father = _parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	@Override
	protected Person clone() {
		Person person = null;
		try {
			person = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}
}
