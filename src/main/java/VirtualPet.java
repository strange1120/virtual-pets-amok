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
			happiness -= 3;
		}
		boredom += 1;
		health -= createRandomFrom1ToInt(2);
		happiness -= createRandomFrom1ToInt(2);
	}

	public void play() {
		boredom -= 5;
		happiness += 3;
	}

	@Override
	public String toString() {
		return name + "\t|" + health + "\t|" + happiness + "\t  |" + boredom;

	}

}
