import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter pet = new VirtualPetShelter();

		pet.addPet(new OrganicDog("AirBud", "Will dunk on you"));
		pet.addPet(new OrganicDog("Cujo", "Will maul you to death"));
		pet.addPet(new OrganicCat("Salem", "Hangs out with a teenage witch"));
		pet.addPet(new OrganicCat("Chalupa", "Was named because the owner loves Taco Bell"));
		pet.addPet(new RobotDog("Dobby", "Resembles the Harry Potter elf"));
		pet.addPet(new RobotDog("Gerald", "Looks like a pinata"));
		pet.addPet(new RoboticCat("Ruxin", "Is larger than the average cat robot"));
		pet.addPet(new RoboticCat("Mufasa", "King of the jungle"));

		System.out.println("Welcome to Haus of Strange Reptile Rehab Center!");
		pet.showPetStats();
		menu();
		int selection = input.nextInt();
		while (selection < 1 || selection > 9) {
			System.out.println("You have entered an invalid choice.");
			pet.showPetStats();
			menu();
			selection = input.nextInt();
		}

		while (selection >= 1 && selection <= 9) {
			if (selection == 1) {
				System.out.println("You have fed all of the organic pets.");
				pet.feedAllOrganic();
			}
			if (selection == 2) {
				System.out.println("You have given all of the organic pets water.");
				pet.waterAllOrganic();
			}
			if (selection == 3) {
				System.out.println("You have oiled up all of the robotic pets.");
				pet.oilAllRobotPets();
			}
			String name = "";
			if (selection == 4) {
				System.out.println("You want to play with one of the organic pets. Please choose one by name");
				pet.showPetStats();
				name = nameMatch(input, pet);
				System.out.println(
						"You have played with " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
				pet.pets.get(name).play();
			}
			if (selection == 5) {
				System.out.println("You would like to adopt a pet.");
				pet.showPetStats();
				System.out.println("Which pet would you like to adopt?");
				name = nameMatch(input, pet);
				System.out.println(
						"You have adopted " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " is looking forward to their forever home!");
				pet.adoption(name);
			}

			if (selection == 6) {
				System.out.println("You would like to admit a pet to the shelter.\n"
						+ "I will need some information about this pet.");
				System.out.println("What is your animal's name?");
				name = input.next();
				System.out.println("How would you describe " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "?");
				input.nextLine();
				String description = input.nextLine();
				System.out.println(
						"What kind of animal is " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
								+ "1. Organic Dog" + "2. Organic Cat" + "3. Robot Cat" + "4. Robot Dog");
				int choice = 0;
				if (choice == 1) {
					pet.addPet(new OrganicDog(name, description));
				}
				if (choice == 2) {
					pet.addPet(new OrganicCat(name, description));
				}
				if (choice == 3) {
					pet.addPet(new RobotDog(name, description));
				}
				if (choice == 4) {
					pet.addPet(new RoboticCat(name, description));
				}

			}
			if (selection == 7) {
				System.out.println("You want to clean one of the dog's cages. Please choose one.");
				pet.showPetStats();
				name = nameMatch(input, pet);
				System.out.println("You have cleaned " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "'s cage.");
				pet.cleanAllCages();
			}
			if (selection == 8) {
				System.out.println("Thanks for taking the dogs for a walk!");
				pet.walkAllDogs();
			}
			if (selection == 9) {
				System.out.println("Thanks for stopping by the Virtual Pet Shelter.");
				System.exit(0);
			}
			pet.tickAll(selection);
			pet.showPetStats();
			menu();
			selection = input.nextInt();
		}
	}

	public static void menu() {
		System.out.println("What would you like to do next? " + "\n1. Feed the organic pets."
				+ "\n2. Refill water for the organic pets." + "\n3. Oil the robotic pets." + "\n4. Play with a pet"
				+ "\n5. Adopt a pet" + "\n6. Admit a pet" + "\n7. Clean the dogs cages" + "\n8. Walk the dogs"
				+ "\n9. Quit");
	}

	public static String nameMatch(Scanner input, VirtualPetShelter pet) {
		String name = input.next().toLowerCase();
		input.nextLine();
		while (!pet.selectPetName(name)) {
			System.out.println("Sorry we don't have an organic pet by that name.");
			pet.showPetStats();
			System.out.println("Please choose one.");
			name = input.next();
			input.nextLine();
		}
		return name;
	}
}
