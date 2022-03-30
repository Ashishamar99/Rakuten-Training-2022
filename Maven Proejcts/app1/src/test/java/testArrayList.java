import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class testArrayList {
	
	List<String> list;
	
	@Before
	public void init() {
		list = new ArrayList<String>();
	}
	
	@Test
	public void testAdd() {
		boolean result = list.add("Ram");
		assertTrue(result);
		//We can also use assertEquals(1, list.size()) instead os assertTrue.
		
	}
	
	@Test
	public void testRemove() {
		list.add("Ram");
		list.add("Shaym");
		list.add("Bhaym");
		
		String result = list.remove(2);
		assertEquals("Bhaym", result);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveFromBlank() {
		String result = list.remove(0);
		assertEquals("Ram", result);
	}
	
	@Test
	public void testClear() {
		list.add("Ram");
		list.add("Shaym");
		list.add("Bhaym");
		
		list.clear();
		assertEquals(0, list.size());
	}
}