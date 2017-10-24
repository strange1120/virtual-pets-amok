import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter virtualPet = new VirtualPetShelter();

		virtualPet.addPet(new OrganicDog("AirBud", "Will dunk on you"));
		virtualPet.addPet(new OrganicDog("Cujo", "Will maul you to death"));
		virtualPet.addPet(new OrganicCat("Salem", "Hangs out with a teenage witch"));
		virtualPet.addPet(new OrganicCat("Chalupa", "Was named because the owner loves Taco Bell"));
		virtualPet.addPet(new RobotDog("Dobby", "Resembles the Harry Potter elf"));
		virtualPet.addPet(new RobotDog("Gerald", "Looks like a pinata"));
		virtualPet.addPet(new RobotCat("Ruxin", "Is larger than the average robot cat"));
		virtualPet.addPet(new RobotCat("Mufasa", "King of the jungle"));

		System.out.println("Welcome to Haus of Strange Virtual Pets!");
		virtualPet.showPetStats();
		menu();
		int selection = input.nextInt();
		selection = selectionParameters(input, virtualPet, selection);

		while (selection >= 1 && selection <= 10) {
			if (selection == 1) {
				System.out.println("You have fed all of the organic pets.");
				virtualPet.feedAllOrganic();
			}
			if (selection == 2) {
				System.out.println("You have given all of the organic pets water.");
				virtualPet.waterAllOrganic();
			}
			if (selection == 3) {
				System.out.println("You have oiled up all of the robotic pets.");
				virtualPet.oilAllRobotPets();
			}
			String name = "";
			if (selection == 4) {
				System.out.println("You want to play with one of the organic pets. Please choose one by name");
				virtualPet.showPetStats();
				name = nameMatch(input, virtualPet);
				System.out.println(
						"You have played with " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
				virtualPet.virtualPets.get(name).play();
			}
			if (selection == 5) {
				System.out.println("You would like to adopt a pet.");
				virtualPet.showPetStats();
				System.out.println("Which pet would you like to adopt?");
				name = nameMatch(input, virtualPet);
				System.out.println(
						"You have adopted " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " is looking forward to their forever home!");
				virtualPet.adoption(name);
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
								+ "\n1. Organic Dog" + "\n2. Organic Cat" + "\n3. Robot Cat" + "\n4. Robot Dog");
				int choice = input.nextInt();
				while (choice < 1 || choice > 4) {
					System.out.println("You have entered an invalid choice.");
					virtualPet.showPetStats();
					admitMenu(virtualPet, name, description, choice);
					choice = input.nextInt();
				}
				admitMenu(virtualPet, name, description, choice);
			}
			if (selection == 7) {
				System.out.println("You have cleaned all of the dogs cages. Thanks!");
				virtualPet.cleanAllCages();
			}
			if (selection == 8) {
				System.out.println("Thanks for taking the dogs for a walk!");
				virtualPet.walkAllDogs();
			}
			if (selection == 9) {
				System.out.println("You have cleaned the litter box. Thanks!");
				virtualPet.cleanLitterBox();
			}
			if (selection == 10) {
				System.out.println("Thanks for stopping by Haus of Strange Virtual Pets!");
				System.exit(0);
			}
			virtualPet.tickAll(selection);
			virtualPet.showPetStats();
			menu();
			selection = input.nextInt();
			selection = selectionParameters(input, virtualPet, selection);
		}
	}

	public static int selectionParameters(Scanner input, VirtualPetShelter virtualPet, int selection) {
		while (selection < 1 || selection > 10) {
			System.out.println("You have entered an invalid choice.");
			virtualPet.showPetStats();
			menu();
			selection = input.nextInt();
		}
		return selection;
	}

	public static void menu() {
		System.out.println("\nWhat would you like to do next? " + "\n1. Feed the organic pets."
				+ "\n2. Refill water for the organic pets." + "\n3. Oil the robotic pets." + "\n4. Play with a pet"
				+ "\n5. Adopt a pet" + "\n6. Admit a pet" + "\n7. Clean the dogs cages" + "\n8. Walk the dogs"
				+ "\n9. Clean the litter box" + "\n10. Quit");
	}

	public static String nameMatch(Scanner input, VirtualPetShelter virtualPet) {
		String name = input.next().toLowerCase();
		input.nextLine();
		while (!virtualPet.selectPetName(name)) {
			System.out.println("Sorry we don't have an organic pet by that name.");
			virtualPet.showPetStats();
			System.out.println("Please choose one.");
			name = input.next();
			input.nextLine();
		}
		return name;
	}

	public static void admitMenu(VirtualPetShelter virtualPet, String name, String description, int choice) {
		if (choice == 1) {
			virtualPet.addPet(new OrganicDog(name, description));
		}
		if (choice == 2) {
			virtualPet.addPet(new OrganicCat(name, description));
		}
		if (choice == 3) {
			virtualPet.addPet(new RobotDog(name, description));
		}
		if (choice == 4) {
			virtualPet.addPet(new RobotCat(name, description));
		}
	}
}
