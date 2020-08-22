package entities;

public class Cow extends Mammal {

	public Cow() {
		super();
	}
	
	public Cow(String name) {
		super(name);
	}
	
	@Override
	public void animalSound() {
		System.out.println("The cow moos...");
	}

}
