package application;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.Bird;
import entities.Mammal;

public class App {

	public static void main(String[] args) {
		
		Animal animal =  new Animal("Animal");
		Mammal mammal =  new Mammal("Mammal");
		Bird bird =  new Bird("Bird");

		animal.animalSound();
		mammal.animalSound();
		bird.animalSound();
		
//		----------------------------------------------------
		Animal animalBird = new Bird();
		Animal animalMammal  = new Mammal();
		Mammal mammalMammal = new Mammal();
		Bird birdBird = new Bird();
		
		List<Animal> animalList = new ArrayList<>();
		animalList.add(animalBird);
		animalList.add(animalMammal);
		animalList.add(mammalMammal);
		animalList.add(birdBird);
		
		for (Animal a: animalList) {
			if (a instanceof Mammal) {
				System.out.println("It's a mammal");
			} else if (a instanceof Bird) {
				System.out.println("It's a bird");
			}
			
			a.animalSound();
		}

	}
}