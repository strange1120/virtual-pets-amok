import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreateADogObject() {
		Dog underTest = new Dog(0,0, "", "", 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatDogIsAVirtualPet() {
		VirtualPet underTest = new Dog(0,0,"","",0);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatOrganicDogIsADog() {
		Dog underTest = new OrganicDog(0,0,"","",0);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatRobotIsADog() {
		Dog underTest = new RobotDog(0,0,"","",0);
		assertNotNull(underTest);
	}
	
	@Test 
	public void assertThatOilLevelsIncreaseWithOilMethod() {
		RobotDog underTest = new RobotDog(0,0, "", "",0);
		underTest.oilRobotPets();
		int check = underTest.getOilLevel();
		assertEquals(40, check, 45);
	}
	
	@Test 
	public void assertThatOrganicCatIsAVirtualPet() {
		VirtualPet underTest = new OrganicCat(0,0,"","",0);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatFeedMakesHungerGoUp() {
		OrganicCat underTest = new OrganicCat(0,0,"","",0);
		OrganicDog underTest2 = new OrganicDog(0,0,"","",0);
		underTest.feed();
		underTest2.feed();
		int check = underTest.getHunger();underTest2.getHunger();
		assertEquals(40, check, 45);
	}
	
	@Test
	public void assertThatFeedMakesThirstGoUp() {
		OrganicCat underTest = new OrganicCat(0,0,"","",0);
		OrganicDog underTest2 = new OrganicDog(0,0,"","",0);
		underTest.water();
		underTest2.water();
		int check = underTest.getThirst();underTest2.getThirst();
		assertEquals(40, check, 45);
	}
	
	@Test
	public void assertThatFeedMakesHungerGoUpAndThirstGoDown() {
		OrganicCat underTest = new OrganicCat(0,0,"","",0);
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(40, check, 45);
		int check2 = underTest.getThirst();
		assertEquals(30,check2, 35);
	}
	
//	@Test
//	public void assertThatCleanSetsCleanlinessForAllOrganicDogsTo50() {
//		VirtualPetShelter underTest = new VirtualPetShelter();
//		underTest.addPet(new OrganicDog(0, 0, "a", "", 1));
//		underTest.addPet(new OrganicDog(0,0, "b","",1));
//		underTest.cleanAllCages();
//		int 
//		assertEquals(check, 50);
//	}
	
	@Test
	public void assertThatCleanCageSetsCleanlinessTo50() {
		OrganicDog underTest = new OrganicDog(0,0,"","",0);
		underTest.cleanCage();
		int check = underTest.getCleanliness();
		assertEquals(check, 50);
	}
	
	@Test
	public void assertThatCleanLitterBoxSetsLitterBoxTo0() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new OrganicCat(0, 0, "", "", 1));
		underTest.cleanLitterBox();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check,0);
	}
	
	@Test
	public void assertThatFeedIncreasesLitterBoxLevelForOneCat() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new OrganicCat(0, 0, "", "", 1));
		underTest.feedAllOrganic();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 18);
	}
	
	
	@Test
	public void assertThatFeedAllOrganicPetsIncreasesLitterBoxForMultipleCats() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(new OrganicCat(0, 0, "a", "", 1));
		underTest.addPet(new OrganicCat(0, 0, "b", "", 1));
		underTest.addPet(new OrganicCat(0, 0, "c", "", 1));
		underTest.feedAllOrganic();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 24);
	}
	
	
	
	
	
}
