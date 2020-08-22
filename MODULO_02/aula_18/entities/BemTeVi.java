package entities;

public class BemTeVi extends Bird {

	public BemTeVi() {
		super();
	}
	
	public BemTeVi(String name) {
		super(name);
	}
	
	@Override
	public void animalSound() {
		System.out.println("The BemTiVi sings");
	}

}
