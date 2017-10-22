
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

	@Override
	public void feed() {
		hunger += createRandomFrom1ToInt(5);
		thirst -= createRandomFrom1ToInt(5);
		amountOfWaste += createRandomFrom1ToInt(4);
	}

	public void cleanCage() {
		amountOfWaste = 0;
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
		hunger -= 1;
		thirst -= 1;
		amountOfWaste += 1;
	}

	@Override
	public void walk() {
		super.walk();
		amountOfWaste -= 5;
	}

	@Override
	public String toString() {
		return super.toString() + "\t  |" + hunger + "\t |" + thirst + "\t|" + amountOfWaste + "\t\t|" + description;
	}

}
