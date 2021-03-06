import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	protected Map<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();
	private int litterBoxLevel = 15;

	public Collection<VirtualPet> petInfo() {
		return virtualPets.values();
	}

	public boolean selectPetName(String name) {
		return virtualPets.containsKey(name);
	}

	public void addPet(VirtualPet pet) {
		virtualPets.put(pet.getName().toLowerCase(), pet);
	}

	public void adoption(String name) {
		virtualPets.remove(name.toLowerCase());
	}

	public void cleanLitterBox() {
		litterBoxLevel = 0;
	}

	public void oilAllRobotPets() {
		for (VirtualPet current : virtualPets.values()) {
			if (current instanceof RobotInterface) {
				((RobotInterface) current).oilRobotPets();
			}
		}
	}

	public void cleanAllCages() {
		for (VirtualPet current : virtualPets.values()) {
			if (current instanceof OrganicDog) {
				((OrganicDog) current).cleanCage();
			}
		}
	}

	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	public void feedAllOrganic() {
		for (VirtualPet current : virtualPets.values()) {
			if (current instanceof OrganicInterface) {
				((OrganicInterface) current).feed();
			}
		}

		for (VirtualPet currentCat : virtualPets.values()) {
			if (currentCat instanceof OrganicCat) {
				litterBoxLevel += 2;
			}
		}
	}

	public void walkAllDogs() {
		for (VirtualPet current : virtualPets.values()) {
			if (current instanceof Dog) {
				((Dog) current).walk();
			}
		}
	}

	public void waterAllOrganic() {
		for (VirtualPet current : virtualPets.values()) {
			if (current instanceof OrganicInterface) {
				((OrganicInterface) current).water();
			}
		}
		for (VirtualPet currentCat : virtualPets.values()) {
			if (currentCat instanceof OrganicCat) {
				litterBoxLevel += 2;
			}
		}
	}

	public void tickAll(int selection) {
		for (VirtualPet current : virtualPets.values()) {
			current.tick(selection);
			if (current.getHealth() > 50) {
				current.setHealth(50);
			}
			if (current.getHealth() < 0) {
				current.setHealth(0);
			}
			if (current.getHappiness() > 50) {
				current.setHappiness(50);
			}
			if (current.getHappiness() < 0) {
				current.setHappiness(0);
			}
			if (current.getBoredom() > 50) {
				current.setBoredom(50);
			}
			if (current.getBoredom() < 0) {
				current.setBoredom(0);
			}
		}
		if (litterBoxLevel < 0) {
			litterBoxLevel = 0;
		}
		if (litterBoxLevel > 50) {
			litterBoxLevel = 50;
		}
		if (litterBoxLevel > 30) {
			for (VirtualPet currentCat : virtualPets.values()) {
				if (currentCat instanceof OrganicCat) {
					currentCat.setHealth(currentCat.getHealth() - 2);
				}
			}
			if (selection != 9) {
				for (VirtualPet currentCat : virtualPets.values()) {
					if (currentCat instanceof OrganicCat) {
						litterBoxLevel += 2;
					}
				}
			}
		}
	}

	public void showPetStats() {
		System.out.println("------------" + "\nOrganic Cats\n" + "------------" + "\nLitter Box Level|" + litterBoxLevel
				+ "\nName\t|Health\t|Happiness|Boredom|Hunger|Thirst|Description");
		for (VirtualPet currentOrgCat : virtualPets.values()) {
			if (currentOrgCat instanceof OrganicCat) {
				System.out.println(currentOrgCat);
			}
		}
		System.out.println("----------" + "\nRobot Cats\n" + "----------"
				+ "\nName\t|Health\t|Happiness|Boredom|Oil Level|Description");
		for (VirtualPet currentRoboCat : virtualPets.values()) {
			if (currentRoboCat instanceof RobotCat) {
				System.out.println(currentRoboCat);
			}
		}
		System.out.println("------------" + "\nOrganic Dogs\n" + "------------"
				+ "\nName\t|Health\t|Happiness|Boredom|Hunger|Thirst|Waste in Cage|Description");
		for (VirtualPet currentOrgDog : virtualPets.values()) {
			if (currentOrgDog instanceof OrganicDog) {
				System.out.println(currentOrgDog);
			}
		}
		System.out.println("----------" + "\nRobot Dogs\n" + "----------"
				+ "\nName\t|Health\t|Happiness|Boredom|Oil Level|Description");
		for (VirtualPet currentRoboDog : virtualPets.values()) {
			if (currentRoboDog instanceof RobotDog) {
				System.out.println(currentRoboDog);
			}
		}
	}

}
