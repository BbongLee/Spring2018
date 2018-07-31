package shapeExam;

public abstract class Shape {
	protected int area;
	
	public abstract void calcArea(); //강제 재정의!!
	
	public void printArea(){
		System.out.println(getName()+"의 넓이 : "+area);
	}
	public abstract String getName();
	
}
