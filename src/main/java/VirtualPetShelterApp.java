import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter pet = new VirtualPetShelter();
		
		RobotDog gerald = new RobotDog(35, 35, "Gerald", "Looks like a pinata", 35);
		OrganicDog cujo = new OrganicDog(35, 35, "Cujo", "Will maul you to death", 35);
		OrganicDog airBud = new OrganicDog(35, 35, "AirBud", "Will dunk on you", 35);
		
		pet.addPet(gerald);
		pet.addPet(cujo);
		pet.addPet(airBud);
		
	}

}
