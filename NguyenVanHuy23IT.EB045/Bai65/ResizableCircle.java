package Bai65;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}
	@Override
	public void resize(int percent) {
		// TODO Auto-generated method stub
		super.radius*=percent/100.0;
	}
     
	public String toString() {
		return "Resizable["+super.toString()+"]";
	}
}
