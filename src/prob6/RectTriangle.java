package prob6;

public class RectTriangle extends Shape {

	public RectTriangle( double width, double height ) {
		super( 3, width, height );
	}
	
	@Override
	public double getArea() {
		return width * height / 2.;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt( width*width + height*height );
	}
}
