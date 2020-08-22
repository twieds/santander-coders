package entities;

public class Dog extends Mammal {

	public Dog() {
		super();
	}
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void animalSound() {
		System.out.println("The dog barks");
	}

}
