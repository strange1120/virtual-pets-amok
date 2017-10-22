import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	protected Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	private int litterBoxLevel = 15;

	public Collection<VirtualPet> petInfo() {
		return pets.values();
	}

	public boolean selectPetName(String name) {
		return pets.containsKey(name);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName().toLowerCase(), pet);
	}

	public void adoption(String name) {
		pets.remove(name.toLowerCase());
	}

	public void cleanLitterBox() {
		litterBoxLevel = 0;
	}

	public void oilAllRobotPets() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof RobotInterface) {
				((RobotInterface) current).oilRobotPets();
			}
		}
	}

	public void cleanAllCages() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicDog) {
				((OrganicDog) current).cleanCage();
			}
		}
	}

	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	public void feedAllOrganic() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicInterface) {
				((OrganicInterface) current).feed();
			}
		}

		for (VirtualPet currentCat : pets.values()) {
			if (currentCat instanceof OrganicCat) {
				litterBoxLevel += 2;
			}

		}
	}

	public void walkAllDogs() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof Dog) {
				((Dog) current).walk();
			}
		}
	}

	public void waterAllOrganic() {
		for (VirtualPet current : pets.values()) {
			if (current instanceof OrganicInterface) {
				((OrganicInterface) current).water();
			}
		}
	}

	public void tickAll(int selection) {
		for (VirtualPet current : pets.values()) {
			current.tick(selection);
		}
		for (VirtualPet currentCat : pets.values()) {
			if (currentCat instanceof OrganicCat) {
				litterBoxLevel += 2;
			}
		}
	}

	public void showPetStats() {
		System.out.println("Organic Cats\nName\t|Health\t|Happiness|Boredom|Hunger|Thirst|Description");
		for (VirtualPet currentOrgCat : pets.values()) {
			if (currentOrgCat instanceof OrganicCat) {
				System.out.println(currentOrgCat);
			}
		}
		System.out.println("Robot Cats\nName\t|Health\t|Happiness|Boredom|Oil Level|Description");
		for (VirtualPet currentRoboCat : pets.values()) {
			if (currentRoboCat instanceof RoboticCat) {
				System.out.println(currentRoboCat);
			}
		}
		System.out.println("Organic Dogs\nName\t|Health\t|Happiness|Boredom|Hunger|Thirst|Amount of Waste|Description");
		for (VirtualPet currentOrgDog : pets.values()) {
			if (currentOrgDog instanceof OrganicDog) {
				System.out.println(currentOrgDog);
			}
		}
		System.out.println("Robot Dogs\nName\t|Health\t|Happiness|Boredom|Oil Level|Description");
		for (VirtualPet currentRoboDog : pets.values()) {
			if (currentRoboDog instanceof RobotDog) {
				System.out.println(currentRoboDog);
			}
		}
	}

}
