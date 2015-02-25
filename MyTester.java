import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(6);
		
		assertEquals("5!=120", 720.00, actual, 0.0);
	}

	@Test
	public void testBinarySearch() {
		MyCalculator mz = new MyCalculator();
		int arr[] = {11, 20, 25, 29, 37};
		
		float actual2 = mz.binarySearch(arr, 20);
		
		assertEquals("11 is in index 0", 1, actual2, 0.0);

	}

}
