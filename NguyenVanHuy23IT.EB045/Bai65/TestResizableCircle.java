package Bai65;

public class TestResizableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ResizableCircle r1=new ResizableCircle(4);
         System.out.println(r1.toString());
         System.out.println(r1.getArea());
         System.out.println(r1.getPerimeter());
       
         r1.resize(75);
         System.out.println(r1.toString());
         System.out.println(r1.getArea());
         System.out.println(r1.getPerimeter());
        
	}

}
