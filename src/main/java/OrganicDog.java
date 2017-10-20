
public class OrganicDog extends Dog implements OrganicInterface {

	protected int hunger;
	protected int thirst;
	protected int cleanliness;
	
	public OrganicDog(int health, int happiness, String name, String description, int boredom) {
		super(health, happiness, name, description, boredom);
		this.hunger = 35;
		this.thirst = 35;
		this.cleanliness = 35;	
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

	public void setCleanliness(int cleanliness) {
		this.cleanliness = 50;
	}

	@Override
	public void feed() {
		hunger += createRandomFrom1ToInt(5);
		thirst -= createRandomFrom1ToInt(5);
		cleanliness -= createRandomFrom1ToInt(5);
	}

	public void cleanCage() {
		cleanliness = 50;
	}

	@Override
	public void water() {
		thirst += createRandomFrom1ToInt(5);
		hunger -= createRandomFrom1ToInt(5);
		cleanliness -= createRandomFrom1ToInt(5);
		
	}
	
}
