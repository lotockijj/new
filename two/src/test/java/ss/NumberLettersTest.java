package ss;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class NumberLettersTest {
	private NumberLetters num;
	
	@Before
	public void setUp() throws Exception {
		num = new NumberLetters();
	}

	@Test
	public void testSolution() {
		String str = "Hello, Hello Roman!";
		String result = num.solution(str);
		String expected = "{a=1, R=1, e=2, H=2, l=4, m=1, n=1, o=3}";
		Assert.assertEquals(expected, result);
	}

}
