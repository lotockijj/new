package ss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxValueRecursionTest {
	private List<Integer> numbers;
	private List<Integer> numbers2;
	private int[] arr;
	private int[] arr2;
	
	@Before
	public void setUp(){
		arr = new int[]{2, 3, 5, 100, 1, 4};
		arr2 = new int[] {-4, -100, -10, -15};
		numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
		numbers2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
	}
	@Test
	public void testSolution() {
		int max = MaxValueRecursion.solution(numbers);
		Assert.assertEquals(100, max);
		int max2 = MaxValueRecursion.solution(numbers2);
		Assert.assertEquals(-4, max2);
	}
	
	@Test
	public void testSolution2() {
		int max = MaxValueRecursion.solution2(arr);
		Assert.assertEquals(100, max);
		int max2 = MaxValueRecursion.solution2(arr2);
		Assert.assertEquals(-4, max2);
	}

}
