package geometry;

public class Circle {
	
	//métodos estáticos não precisam instanciar a classe para funcionar, 
	//visto que dependem apenas do parametro e não dos atributos da classe
	
	public static double perimeter(double radius) {
		return 2.0 * Math.PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * Math.PI * Math.pow(radius, 3) / 3;
	}
}
