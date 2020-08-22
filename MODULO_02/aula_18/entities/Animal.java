package entities;

public class Animal implements Bicho {

	private String name; 
	
	public Animal() {	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double amountOfLitersOfWater() {
		return 2.0;
	}

}
