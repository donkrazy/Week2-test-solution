package prob6;

public abstract class Shape {
	protected double width;
	protected double height;
	private int countSides;
	
	public Shape( int countSides ) {
		this.countSides = countSides;
	}

	public Shape( int countSides, double width, double height ) {
		this.countSides = countSides;
		this.width = width;
		this.height = height;
	}

	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
}
