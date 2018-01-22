package ss;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SortListTest {
	private SortList sort;
	
	@Before
	public void setUp() throws Exception {
		sort = new SortList();
	}

	@Test
	public void testGetSortedList() {
		List<Integer> numbers = Arrays.asList(2, 4, 1);
		List<Integer> sortedNubmers = sort.getSortedList(numbers);
		List<Integer> expectedNubmers = Arrays.asList(1, 2, 4);
		Assert.assertEquals(expectedNubmers, sortedNubmers);
		Assert.assertNotSame(sortedNubmers, numbers);
		sortedNubmers.forEach(System.out::print);
	} 
	
	@Test
	public void testGetSortedList2() {
		List<Integer> numbers = Arrays.asList(2, 4, 1);
		List<Integer> sortedNubmers = sort.getSortedList2(numbers);
		List<Integer> expectedNubmers = Arrays.asList(1, 2, 4);
		Assert.assertEquals(expectedNubmers, sortedNubmers);
		Assert.assertNotSame(sortedNubmers, numbers);
		sortedNubmers.forEach(System.out::print);
	}

}
