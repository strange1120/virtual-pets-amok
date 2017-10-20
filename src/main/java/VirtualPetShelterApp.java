import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter pet = new VirtualPetShelter();
		
		RobotDog gerald = new RobotDog(35, 35, "Gerald", "Looks like a pinata", 35);
		
		pet.addPet(gerald);
		
	}

}
