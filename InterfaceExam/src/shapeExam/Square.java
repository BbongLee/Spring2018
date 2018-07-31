package shapeExam;

public class Square extends Shape{
	private int width, length;
	
	public Square(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	public void calcArea() {
		area = width*length;
	}

	public String getName() {
		return "»ç°¢Çü";
	}

}
