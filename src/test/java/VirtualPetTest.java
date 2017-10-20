import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreateADogObject() {
		Dog underTest = new Dog(0,0, "", "", 0,0);
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatDogIsAVirtualPet() {
		VirtualPet underTest = new Dog(0,0,"","",0,0);
		assertNotNull(underTest);
	}
	
	
}
