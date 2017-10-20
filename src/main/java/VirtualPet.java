import java.util.Random;

public abstract class VirtualPet {
	
	Random rand = new Random();

	protected int health;
	protected int happiness;
	protected String name;
	protected String description;
	protected int boredom;

	public VirtualPet(int health, int happiness, String name, String description, int boredom) {
		this.health = health;
		this.happiness = happiness;
		this.name = name;
		this.description = description;
		this.boredom = boredom;
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
	
	@Override
	public String toString() {
		return "Name: " + name + "Health: " + health + "Happiness: " + happiness + "Boredom: " + boredom + 
				"\nDescription: " + description;
	}

	
	
	
	
	
	
	
	
}
