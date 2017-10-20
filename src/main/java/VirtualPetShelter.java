import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

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
	
	public void showPetStats() {
		for(VirtualPet pet: pets.values()) {
			System.out.println(pet);
		}
}
}
