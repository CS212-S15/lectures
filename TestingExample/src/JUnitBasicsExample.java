
//Static import allows us to access static members
//without using the fully qualified Class.staticMember syntax
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitBasicsExample {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Setup code run once at the very beginning of the tests");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Teardown code run once at the very end of the tests");
	}
			
	@Before
	public void beforeCode() {
		System.out.println("Setup code per test");
	}	
	
	@After
	public void afterCode() {
		System.out.println("Teardown code per test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1 code");
		
		int a = 1, b = 1;		
		assertTrue("a and b expected to be eaual but are not.", (a==b));
	}

	@Test
	public void test2() {
		System.out.println("Test2 code");

		int a = 1, b = 2;		
		assertTrue("a and b expected to be eaual but are not.", (a==b));

	}

	@Test
	public void test3() {
		System.out.println("Test3 code");

		Object o = null;		
		assertNull("Object expected to be null but has value " + o, o);

	}	
	
}
