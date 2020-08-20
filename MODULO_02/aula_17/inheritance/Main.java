package inheritance;

public class Main {

	public static void main(String[] args) {
		Elephant elephant = new Elephant(4, "grey", "mammal", 2);
		System.out.println(elephant);
		
		elephant.changeColor("white");
		System.out.println(elephant);
	}

}
