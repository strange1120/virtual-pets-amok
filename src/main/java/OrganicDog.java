
public class OrganicDog extends Dog {

	protected int hunger;
	protected int thirst;
	protected int cleanliness;
	
	public OrganicDog(int health, int happiness, String name, String description, int boredom, int cleanliness, int hunger, int thirst) {
		super(health, happiness, name, description, boredom);
		this.hunger = hunger;
		this.thirst = thirst;
		this.cleanliness = cleanliness;	
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getCleanliness() {
		return cleanliness;
	}
	
	

	
	
}
