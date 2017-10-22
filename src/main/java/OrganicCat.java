
public class OrganicCat extends VirtualPet implements OrganicInterface {

	private int hunger;
	private int thirst;

	public OrganicCat(String name, String description) {
		super(name, description);
		this.health = 35;
		this.happiness = 35;
		this.boredom = 35;
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
	public void tick(int selection) {
		super.tick(selection);
		if (hunger < 25) {
			health -= 3;
		}
		if (thirst < 25) {
			health -= 3;
		}
		hunger -= 1;
		thirst -= 1;
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

	@Override
	public String toString() {
		return super.toString() + "\t  |" + hunger + "\t |" + thirst + "\t|" + description;
	}

}
