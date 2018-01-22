package ss;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumberTest {
	private PrimeNumber prime;
	
	@Before
	public void setUp() throws Exception {
		prime = new PrimeNumber();
	}

	@Test
	public void testSolution() {
		Assert.assertTrue(prime.solution(11));
		Assert.assertTrue(prime.solution(13));
		Assert.assertTrue(prime.solution(47));
		Assert.assertTrue(prime.solution(2));
		Assert.assertFalse(prime.solution(6));
		Assert.assertFalse(prime.solution(10));
		Assert.assertFalse(prime.solution(26));
	}

}