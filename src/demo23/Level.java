package demo23;

public enum Level {
	COMMON(3, "会员"), VIP(5, "贵宾");

	private int index;
	private String name;

	private Level(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}
}
