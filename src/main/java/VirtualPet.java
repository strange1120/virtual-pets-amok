
public abstract class VirtualPet {

	protected int health;
	protected int happiness;
	protected String name;
	protected String description;
	protected int boredom;
	protected int cleanliness;

	public VirtualPet(int health, int happiness, String name, String description, int boredom, int cleanliness) {
		this.health = health;
		this.happiness = happiness;
		this.name = name;
		this.description = description;
		this.boredom = boredom;
		this.cleanliness = cleanliness;
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

	public int getCleanliness() {
		return cleanliness;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "Health: " + health + "Happiness: " + happiness + "Boredom: " + boredom + "Cleanliness: " + cleanliness + 
				"\nDescription: " + description;
	}
	
	
	
	
	
	
	
	
}
