package ss;

public class Fibonacci {
	
	public int solution(int n) {
		if(n <= 1) {
			return n;
		} 
		return solution(n - 1) + solution(n - 2);
	}
}
