package codility.lesson5.third;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenomicRangeQueryTest {
	private GenomicRangeQuery gen;

	@Before
	public void setUp() throws Exception {
		gen = new GenomicRangeQuery();
	}

	@Test
	public void testSolution() {
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		int[] result = gen.solution(S, P, Q);
		Arrays.stream(result).forEach(s -> System.out.print(s + ", "));
		int[] expected = {2, 4, 1};
		Assert.assertArrayEquals(expected, result);
		
		System.out.println();
		String S2 = "C";
		int[] P2 = {0};
		int[] Q2 = {0};
		int[] result2 = gen.solution(S2, P2, Q2);
		Arrays.stream(result2).forEach(s -> System.out.print(s + ", "));
		int[] expected2 = {2};
		Assert.assertArrayEquals(expected2, result2);
	} 
	
//	@Test
//	public void testSolution2() {
//		String S = "CAGCCTA";
//		int[] P = {2, 5, 0};
//		int[] Q = {4, 5, 6};
//		int[] result = gen.solution2(S, P, Q);
//		int[] expected = {2, 4, 1};
//		Assert.assertArrayEquals(expected, result);
//	} 

//	public int[] solution(String S, int[] P, int[] Q) { // Correctness 100%, Performance 0%, task score 62%. 
//		int[] result = new int[P.length];
//		int min = Integer.MAX_VALUE;
//		for (int i = 0; i < P.length; i++) {
//			int n = 0;
//			for(int j = P[i]; j <= Q[i]; j++) {
//				if(S.charAt(j) == 'A') n = 1;
//				if(S.charAt(j) == 'C') n = 2;
//				if(S.charAt(j) == 'G') n = 3;
//				if(S.charAt(j) == 'T') n = 4;
//				if(min > n) min = n;
//			}
//			result[i] = min;
//			min = Integer.MAX_VALUE;
//		}
//		return result;
//	}
	
//	
//	public int[] solution(String S, int[] P, int[] Q) { // Correctness 100%, Performance 0%, task score 62%. 
//		int[] result = new int[P.length];
//		int[] convertedString = new int[S.length()];
//		for (int i = 0; i < convertedString.length; i++) {
//			int n = 0;
//			char c = S.charAt(i);
//			if(c == 'A') n = 1;
//			if(c == 'C') n = 2;
//			if(c == 'G') n = 3;
//			if(c == 'T') n = 4;
//			convertedString[i] = n;
//		}
//		for (int i = 0; i < P.length; i++) {
//			int min = 4;
//			for(int j = P[i]; j <= Q[i]; j ++) {
//				if(min > convertedString[j]) min = convertedString[j];
//			}
//			result[i] = min;
//			min = 4;
//		}
//		return result;
//	}
//
//	public int[] solution2(String S, int[] P, int[] Q) { // Correctness 100%, Performance 0%, task score 62%. 
//		int[] result = new int[P.length];
//		int[] convertedString = new int[S.length()];
//		for (int i = 0; i < convertedString.length; i++) {
//			int n = 4;
//			char c = S.charAt(i);
//			if(c == 'A') { n = 1; convertedString[i] = n; continue;}
//			if(c == 'C') { n = 2; convertedString[i] = n; continue;}
//			if(c == 'G') { n = 3; convertedString[i] = n; continue;}
//			n = 4; convertedString[i] = n;
//		}
//		for (int i = 0; i < P.length; i++) {
//			int min = 4;
//			for(int j = P[i]; j <= Q[i]; j ++) {
//				if(min > convertedString[j]) min = convertedString[j];
//			}
//			result[i] = min;
//			min = 4;
//		}
//		return result;
//	}
	
//	public int[] solution(String S, int[] P, int[] Q) { // Correctness 40%, performance 0%, score 25%
//		int[] result = new int[P.length];
//		int n = 4;
//		for (int i = 0; i < S.length(); i++) {
//			char c = S.charAt(i);
//			for (int j = 0; j < result.length; j++) {
//				if(P[j] <= i && i <= Q[j]) {
//					if(result[j] == 0) {
//						result[j] = 4;
//					} else {
//						if(c == 'A') n = 1;
//						if(c == 'C') n = 2;
//						if(c == 'G') n = 3;
//						if(c == 'T') n = 4;
//						if(result[j] > n) {
//							result[j] = n;
//						}
//					}
//				}
//			}
//		}
//		return result;
//	}


}
