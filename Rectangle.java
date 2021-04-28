
public class Rectangle implements Shape {
	double length;
	double breadth;
	
	
	@Override
	public double computeArea() {
		return length*breadth;
	
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	

}
