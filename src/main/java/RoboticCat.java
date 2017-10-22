
public class RoboticCat extends VirtualPet implements RobotInterface {

	private int oilLevel;

	public RoboticCat(String name, String description) {
		super(name, description);
		this.health = 35;
		this.happiness = 35;
		this.boredom = 35;
		this.oilLevel = 35;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oilRobotPets() {
		oilLevel += createRandomFrom1ToInt(5);
	}

	// @Override
	public void tick(int selection) {
		super.tick(selection);
		if (selection != 3) {
			oilLevel -= 2;
		}
		if (oilLevel < 25) {
			health -= 5;
		}
		oilLevel -= 1;
	}

	@Override
	public String toString() {
		return super.toString() + "\t  |" + oilLevel + "\t    |" + description;

	}
}
