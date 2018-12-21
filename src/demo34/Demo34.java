package demo34;

import demo34.Desc.Color;

public class Demo34 {

}

@Desc(c = Color.White)
abstract class Bird {
	public abstract Color getColor();
}

class Sparrow extends Bird{
	private Color color;
	

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	
}