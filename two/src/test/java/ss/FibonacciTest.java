package ss;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FibonacciTest {
	private Fibonacci fib;
	
	@Before
	public void setUp() throws Exception {
		fib = new Fibonacci();
	}

	@Test
	public void testSolution() {
		int result = fib.solution(6);
		Assert.assertEquals(8, result);
		result = fib.solution(12);
		Assert.assertEquals(144, result);
	}

}
