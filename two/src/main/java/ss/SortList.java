package ss;

import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public List<Integer> getSortedList(List<Integer> numbers){
		return numbers.stream().sorted().collect(Collectors.toList());
	}

	public List<Integer> getSortedList2(List<Integer> numbers){
		List<Integer> copyNumbers = numbers.stream().map(Integer::intValue).collect(Collectors.toList());
		for (int i = 0; i < copyNumbers.size(); i++) {
			for (int j = 0; j < copyNumbers.size(); j++) {
				if(i != j) {
					if(copyNumbers.get(i) < copyNumbers.get(j)) {
						int res = copyNumbers.get(i);
						copyNumbers.set(i, copyNumbers.get(j));
						copyNumbers.set(j, res);
					}
				}
			}
		}
		return copyNumbers;
	}
}
