
public class RobotDog extends Dog implements RobotInterface {

	protected int oilLevel;

	public RobotDog(int health, int happiness, String name, String description, int boredom) {
		super(health, happiness, name, description, boredom);
		this.oilLevel = 35;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oilRobotPets() {
		oilLevel += createRandomFrom1ToInt(5);
	}

	
}
