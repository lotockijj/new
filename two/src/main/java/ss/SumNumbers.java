package ss;

public class SumNumbers {

	public int solution(int n) {
		String str = Integer.toString(n);
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				result += Character.getNumericValue(str.charAt(i));
			} else {
				throw new NumberFormatException();
			}
		}
		return result;
	}
	
	public int solution2(int n) {
		String[] str = Integer.toString(n).split("");
		int result = 0;
		for (int i = 0; i < str.length; i++) {
			result += Integer.parseInt(str[i]);
		}
		return result;
	}
	
	public int solutionString(String str) {
		String[] arr = str.split("");
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i].charAt(0))) {
			result += Integer.parseInt(arr[i]);
			} else {
				throw new NumberFormatException();
			}
		}
		return result;
	}
}
