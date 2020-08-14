package geometry;

public class Rectangle {
	public double height;
	public double width;
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return 2 * (height + width);
	}
	
	public double diagonal() {
		 return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	@Override
	public String toString() {
		return "Area: " + area() + "\n" +
				    "Perimetro: " + perimeter() +  "\n" +
				    "Diagonal: " + diagonal();
	}
}
