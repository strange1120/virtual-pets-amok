import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter implements OrganicInterface, RobotInterface {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	
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
	
//	public void feedOrganicPets() {
//		for (VirtualPet feedOrganicPets : pets.values()) {
//			feedOrganicPets.feed();
//		}
//	}
//
//	public void waterOrganicPets() {
//		for (VirtualPet waterOrganicPets : pets.values()) {
//			waterOrganicPets.water();
//		}
//	}
	public void showPetStats() {
		for(VirtualPet pet: pets.values()) {
			System.out.println(pet);
		}
}

	@Override
	public void oilRobotPets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		
	}
}
