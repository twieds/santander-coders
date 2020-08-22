package entities;

public class Parrot extends Bird {

	public Parrot() {
		super();
	}
	
	public Parrot(String name) {
		super(name);
	}
	
	@Override
	public void animalSound() {
		System.out.println("The Parrot echoes sounds");
	}

}
