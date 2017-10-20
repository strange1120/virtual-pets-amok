import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	
	public Collection<VirtualPet> petInfo() {
		return pets.values();
	}
	public void showPetStats() {
		for(VirtualPet pet: pets) {
			System.out.println(pet);
		}
}
}
