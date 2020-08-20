package inheritance;

public class Animal {
	private Integer numberOfLegs;
	protected String color;
	private String classification;
	

	public Animal() {}
	
	public Animal(Integer numberOfLegs, String color, String classification) {
		super();
		this.numberOfLegs = numberOfLegs;
		this.color = color;
		this.classification = classification;
	}


	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}


	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	@Override
	public String toString() {
		return "Animal [numberOfLegs=" + numberOfLegs + ", color=" + color + ", classification=" + classification + "]";
	}

}
