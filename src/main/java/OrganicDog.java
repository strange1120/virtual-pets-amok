
public class OrganicDog extends Dog implements OrganicInterface {

	protected int hunger;
	protected int thirst;
	protected int amountOfWaste;

	public OrganicDog(String name, String description) {
		super(name, description);
		this.health = 35;
		this.happiness = 35;
		this.boredom = 35;
		this.hunger = 35;
		this.thirst = 35;
		this.amountOfWaste = 10;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getAmountOfWaste() {
		return amountOfWaste;
	}

	public void cleanCage() {
		amountOfWaste = 0;
	}

	@Override
	public void feed() {
		hunger += createRandomFrom1ToInt(5);
		thirst -= createRandomFrom1ToInt(5);
		amountOfWaste += createRandomFrom1ToInt(4);
	}

	@Override
	public void water() {
		thirst += createRandomFrom1ToInt(5);
		hunger -= createRandomFrom1ToInt(5);
		amountOfWaste += createRandomFrom1ToInt(4);

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
		if (amountOfWaste > 25) {
			health -= 3;
		}
		if (selection != 1) {
			hunger -= createRandomFrom1ToInt(2);
		}
		if (selection != 2) {
			thirst -= createRandomFrom1ToInt(2);
		}
		if (selection != 8) {
			amountOfWaste += createRandomFrom1ToInt(2);
		}
		if (selection != 7) {
			amountOfWaste += createRandomFrom1ToInt(2);
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
		if (amountOfWaste < 0) {
			amountOfWaste = 0;
		}
		if (amountOfWaste > 50) {
			amountOfWaste = 50;
		}
	}

	@Override
	public void walk() {
		super.walk();
		amountOfWaste -= createRandomFrom1ToInt(3);
	}

	@Override
	public String toString() {
		return super.toString() + "\t  |" + hunger + "\t |" + thirst + "\t|" + amountOfWaste + "\t\t|"
				+ description.substring(0, 1).toUpperCase() + description.substring(1).toLowerCase();
	}

}
