package entities;

public class Bird extends Animal {

	public Bird() {
		super();
	}
	
	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void animalSound() {
		System.out.println("The bird tweets");
	}

}
