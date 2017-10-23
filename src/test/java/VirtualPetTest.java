import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void assertThatOrganicDogIsADog() {
		Dog underTest = new OrganicDog("", "");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatRobotDogIsADog() {
		Dog underTest = new RobotDog("", "");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatRobotCatIsAVirtualPet() {
		VirtualPet underTest = new RobotCat("", "");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatOilLevelsIncreaseWithOilMethod() {
		RobotDog underTest = new RobotDog("", "");
		underTest.oilRobotPets();
		int check = underTest.getOilLevel();
		assertEquals(40, check, 45);
	}

	@Test
	public void assertThatOrganicCatIsAVirtualPet() {
		VirtualPet underTest = new OrganicCat("", "");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatFeedMakesHungerGoUp() {
		OrganicCat underTest = new OrganicCat("", "");
		OrganicDog underTest2 = new OrganicDog("", "");
		underTest.feed();
		underTest2.feed();
		int check = underTest.getHunger();
		underTest2.getHunger();
		assertEquals(40, check, 45);
	}

	@Test
	public void assertThatFeedMakesThirstGoUp() {
		OrganicCat underTest = new OrganicCat("", "");
		OrganicDog underTest2 = new OrganicDog("", "");
		underTest.water();
		underTest2.water();
		int check = underTest.getThirst();
		underTest2.getThirst();
		assertEquals(40, check, 45);
	}

	@Test
	public void assertThatFeedMakesHungerGoUpAndThirstGoDown() {
		OrganicCat underTest = new OrganicCat("", "");
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(40, check, 45);
		int check2 = underTest.getThirst();
		assertEquals(30, check2, 35);
	}

	@Test
	public void assertThatCleanCageSetsWasteAmountTo0() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.cleanCage();
		int check = underTest.getAmountOfWaste();
		assertEquals(check, 0);
	}

	@Test
	public void assertThatCleanLitterBoxSetsLitterBoxTo0() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new OrganicCat("", ""));
		underTest.cleanLitterBox();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 0);
	}

	@Test
	public void assertThatFeedIncreasesLitterBoxLevelForOneCat() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new OrganicCat("", ""));
		underTest.feedAllOrganic();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 18);
	}

	@Test
	public void assertThatFeedAllOrganicPetsIncreasesLitterBoxForMultipleCats() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new OrganicCat("a", ""));
		underTest.addPet(new OrganicCat("b", ""));
		underTest.addPet(new OrganicCat("c", ""));
		underTest.feedAllOrganic();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 24);
	}

	@Test
	public void assertThatOilAllRobotsWorks() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new RobotCat("a", ""));
		underTest.addPet(new RobotDog("a", ""));
		underTest.oilAllRobotPets();
		assertNotNull(underTest);
	}

	@Test
	public void assertThatWalkMethodWorksForOrganicDogHappiness() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.walk();
		int check = underTest.getHappiness();
		assertEquals(check, 40);
	}

	@Test
	public void assertThatWalkMethodWorksForRobotDogHappiness() {
		RobotDog underTest = new RobotDog("", "");
		underTest.walk();
		int check = underTest.getHappiness();
		assertEquals(check, 40);
	}

	@Test
	public void assertThatWalkMethodWorksForOrganicDogAmountOfWaste() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.walk();
		int check = underTest.getAmountOfWaste();
		assertEquals(check, 5);
	}

}
