import java.util.Random;

public abstract class VirtualPet {

	Random rand = new Random();

	protected int health;
	protected int happiness;
	protected String name;
	protected String description;
	protected int boredom;

	public VirtualPet(String name, String description) {
		this.health = 35;
		this.happiness = 35;
		this.name = name;
		this.description = description;
		this.boredom = 35;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getBoredom() {
		return boredom;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	protected int createRandomFrom1ToInt(int max) {
		return rand.nextInt(max) + 1;
	}

	public void tick(int selection) {
		if (health < 30) {
			happiness -= 2;
		}
		if (boredom < 30) {
			happiness -= 2;
		}
		if (boredom < 0) {
			boredom = 0;
		}
		if (boredom > 50) {
			boredom = 50;
		}
		if (health > 50) {
			health = 50;
		}
		if (health < 0) {
			health = 0;
		}
		if (happiness > 50) {
			happiness = 50;
		}
		if (happiness < 0) {
			happiness = 0;
		}
		if (selection != 4) {
			boredom += createRandomFrom1ToInt(2);
		}
		health -= createRandomFrom1ToInt(2);
		happiness -= createRandomFrom1ToInt(2);
	}

	public void play() {
		boredom -= 5;
		happiness += 3;
	}

	@Override
	public String toString() {
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "\t|" + health + "\t|" + happiness
				+ "\t  |" + boredom;

	}

}
