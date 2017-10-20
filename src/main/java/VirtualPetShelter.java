import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	protected Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	protected int litterBoxLevel = 15;

	public Collection<VirtualPet> petInfo() {
		return pets.values();
	}

	public boolean selectPetName(String name) {
		return pets.containsKey(name);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public void adoption(String name) {
		pets.remove(name.toLowerCase());
	}

	// public void feedOrganicPets() {
	//// int litterBoxLevel = 15;
	// for (VirtualPet current : pets.values()) {
	// if (current instanceof OrganicInterface) {
	// ((OrganicInterface) current).feed();
	// if (current instanceof OrganicCat) {
	// int newLitterBoxLevel = ((OrganicCat) current).getLitterBoxLevel() + 3;
	// newQuantity = item.getQuantity() - quantity;
	// OrganicCat.setLitterBoxLevel(newLitterBoxLevel);
	// }
	// }
	// }
	//// return litterBoxLevel;
	// }
	public void cleanLitterBox() {
		litterBoxLevel = 0;
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
				litterBoxLevel += 3;
			}

		}
	}

	

	// public int litterBoxState() {
	// for (VirtualPet current : pets.values()) {
	// if(current instanceof OrganicCat) {
	// ((OrganicCat) current).getLitterBoxLevel();
	// }
	// }
	// }
	//
	// public void waterOrganicPets() {
	// for (VirtualPet waterOrganicPets : pets.values()) {
	// waterOrganicPets.water();
	// }
	// }
	public void showPetStats() {
		for (VirtualPet pet : pets.values()) {
			System.out.println(pet);
		}
	}

}
