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
		Dog underTest = new OrganicDog(0,0,"","",0, 0, 0, 0);
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
	
	
	
	
}
