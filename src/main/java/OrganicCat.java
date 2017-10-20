
public class OrganicCat extends VirtualPet implements OrganicInterface{

	protected int hunger;
	protected int thirst;

	public OrganicCat(int health, int happiness, String name, String description, int boredom) {
		super(health, happiness, name, description, boredom);
		this.hunger = 35;
		this.thirst = 35;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	@Override
	public void feed() {
		hunger += createRandomFrom1ToInt(5);
		thirst -= createRandomFrom1ToInt(5);
	}


	@Override
	public void water() {
		thirst += createRandomFrom1ToInt(5);
		hunger -= createRandomFrom1ToInt(5);
	}


}
