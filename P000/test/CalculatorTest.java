import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *I declare that this code was written by me
 *I will not copy or allow others to copy my code
 *I understad that copying code is considered as plagiarism.
 *
 * 21006368, 30 May 2022 2:10:23 pm
 */

public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		  Calculator cal = new Calculator();
		  int actual = cal.add(a, b);
		  
		  int expected = 9999;
		  assertEquals (expected,actual);
		  
	}

}
