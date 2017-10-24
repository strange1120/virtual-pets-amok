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

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getBoredom() {
		return boredom;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
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
		if (boredom > 30) {
			happiness -= 2;
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
