
public class Triangle implements Shape{
	double base;
	double height;
	
	

	@Override
	public double computeArea() {
		return 0.5*base*height;
	
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

}
