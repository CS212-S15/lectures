import static org.junit.Assert.*;

import org.junit.Test;


public class TestFileSearcher {

	@Test
	public void testFileNotFound() {
		try {
			boolean result = FileSearcher.containsString("input/NOTAVAILABLE.txt", "brown");
			assertFalse("Result is false when file not available", result);
		} catch(Exception e) {
			fail("FileSearcher.containsString throws exception in case file is not found");
		}
	}
	
	@Test
	public void testTargetNotFound() {
		boolean result = FileSearcher.containsString("input/test1.txt", "brownie");
		assertFalse("Result is false when target not found", result);
		
	}
	
	@Test
	public void testTargetFound() {
		boolean result = FileSearcher.containsString("input/test1.txt", "brown");
		assertTrue("Result is true when target found", result);
		
	}
	
	@Test
	public void testDelimiters() {
		boolean result = FileSearcher.containsString("input/test1.txt", "abc", "\\d+");
		assertTrue("Result is true when target found using delimiters", result);
		
	}
	

}
