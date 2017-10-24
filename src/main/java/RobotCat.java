
public class RobotCat extends VirtualPet implements RobotInterface {

	private int oilLevel;

	public RobotCat(String name, String description) {
		super(name, description);
		this.oilLevel = 35;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oilRobotPets() {
		oilLevel += createRandomFrom1ToInt(5);
	}

	@Override
	public void tick(int selection) {
		super.tick(selection);
		if (selection != 3) {
			oilLevel -= createRandomFrom1ToInt(2);
		}
		if (oilLevel < 25) {
			health -= 3;
		}
		if (oilLevel < 0) {
			oilLevel = 0;
		}
		if (oilLevel > 50) {
			oilLevel = 50;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\t  |" + oilLevel + "\t    |" + description.substring(0, 1).toUpperCase()
				+ description.substring(1).toLowerCase();

	}
}
