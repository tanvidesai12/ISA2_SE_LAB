import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacatoryMain {
public static void main(String args[]) throws IOException {
	double radius;
	double length;
	double breadth;
	double side;
	double base;
	double height;
	String shape;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the shape name");
     shape=br.readLine();
	ShapeFactory shfact=new ShapeFactory();

	if(shape.equalsIgnoreCase("circle")) {
					System.out.println("Enter the radius:");
					radius=Double.parseDouble(br.readLine());
					Circle circ=(Circle)shfact.getShape(shape);
					circ.setRadius(radius);
					System.out.println("Area of the circle is: "+ circ.computeArea());
					
	}
	else if(shape.equalsIgnoreCase("triangle")) {
		System.out.println("Enter the base:");
		base=Double.parseDouble(br.readLine());
		System.out.println("Enter the height:");
		height=Double.parseDouble(br.readLine());
		Triangle tr=(Triangle)shfact.getShape(shape);
		tr.setBase(base);
		tr.setHeight(height);
		System.out.println("Area of the triangle is: "+ tr.computeArea());
		
	}
	else if(shape.equalsIgnoreCase("rectangle")) {
		System.out.println("Enter the length:");
		length=Double.parseDouble(br.readLine());
		System.out.println("Enter the breadth:");
		breadth=Double.parseDouble(br.readLine());
		Rectangle rect=(Rectangle)shfact.getShape(shape);
		rect.setBreadth(breadth);
		rect.setLength(length);
		System.out.println("Area of the rectangle is: "+ rect.computeArea());
		
	}
}
}
