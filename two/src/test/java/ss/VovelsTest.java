package ss;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VovelsTest {
	private Vovels vov;
	
	@Before
	public void setUp() throws Exception {
		vov = new Vovels();
	}

	@Test
	public void testGetVovels() {
		String str = "Hello, hello Roman :) ";
		String result = vov.getVovels(str);
		Assert.assertEquals("eoeooa", result);
	}
	
	@Test
	public void testGetNumberVovels() {
		String str = "Hello, hello Roman :)";
		int result = vov.getNumberVovels(str);
		Assert.assertEquals(6, result);
	}

}
