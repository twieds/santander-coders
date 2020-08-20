package inheritance;

public class Elephant  extends Animal {
	
	public Elephant(Integer trunkLength, String color, String classification, Integer numberOfLegs) {
		super(numberOfLegs, color, classification);
		this.trunkLength = trunkLength;
	}

	private Integer trunkLength;
	
	public Elephant() {
		super();
	}

	public Integer getTrunkLength() {
		return trunkLength;
	}

	public void setTrunkLength(Integer trunkLength) {
		this.trunkLength = trunkLength;
	}
	
	public void changeColor(String color) {
		this.color = color;
	}

	public void run() {
		System.out.println("Running...");
	}

}
