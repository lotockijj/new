package my.epam;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ChildTest extends TestCase {
	
	public void testSecondMethod() {
		Base base = new Child();
		int result = base.firstMethod();
		Assert.assertEquals(1, result);
	}

}
