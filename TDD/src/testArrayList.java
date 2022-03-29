import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testArrayList {
	@Test
	public void testAdd() {
		List<String> list = new ArrayList<>();
		boolean result = list.add("Ram");
		assertTrue(result);
		//We can also use assertEquals(1, list.size()) instead os assertTrue.
		
	}
	
	@Test
	public void testRemove() {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Shaym");
		list.add("Bhaym");
		
		String result = list.remove(2);
		assertEquals("Bhaym", result);
	}
}
