
public class OrganicCat extends VirtualPet implements OrganicInterface {

	private int hunger;
	private int thirst;

	public OrganicCat(String name, String description) {
		super(name, description);
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
		if (selection != 1) {
			hunger -= createRandomFrom1ToInt(2);
		}
		if (selection != 2) {
			thirst -= createRandomFrom1ToInt(2);
		}
		if (thirst < 25) {
			health -= 3;
		}
		if (hunger < 0) {
			hunger = 0;
		}
		if (hunger > 50) {
			hunger = 50;
		}
		if (thirst < 0) {
			thirst = 0;
		}
		if (thirst > 50) {
			thirst = 50;
		}
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
		return super.toString() + "\t  |" + hunger + "\t |" + thirst + "\t|" + description.substring(0, 1).toUpperCase()
				+ description.substring(1).toLowerCase();
	}

}
