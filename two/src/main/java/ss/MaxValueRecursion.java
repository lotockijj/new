package ss;

import java.util.List;
import java.util.stream.IntStream;

public class MaxValueRecursion {
	
	public static int solution(List<Integer> numbers) {
		if(numbers.size() == 1) {
			return numbers.get(0);
		}
		int bottom = solution(numbers.subList(0, numbers.size()/2));
		int top = solution(numbers.subList(numbers.size()/2, numbers.size()));
		return top > bottom ? top : bottom;
	}
	
	public static int solution2(int[] arr) {
		return IntStream.of(arr).max().getAsInt();
	}
	
}
