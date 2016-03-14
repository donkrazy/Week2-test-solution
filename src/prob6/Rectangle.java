package prob6;

public class Rectangle extends Shape implements Resizable {

	public Rectangle( double width, double height ) {
		super( 4, width, height );
	}
	
	@Override
	public void resize(double rate) {
		width *= rate;
		height *= rate;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*width + 2*height;
	}

}
