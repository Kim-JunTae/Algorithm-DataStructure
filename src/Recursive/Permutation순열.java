package Recursive;

import java.util.ArrayList;
import java.util.List;

public class Permutation순열 {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		
		List<String> result = new ArrayList<String>();
		reculsion(arr, result, arr.size(), 2);
	}
	
	/**
	 * 순열 구하기
	 * 
	 * @param arr		: 기준 리스트
	 * @param result	: 결과를 담아줄 리스트
	 * @param n			: 전체 갯수
	 * @param r			: 뽑을 갯수
	 */
	
	private static void reculsion(List<String> arr, List<String> result, int n, int r) {
		
		//탈출문
		if(r == 0) {
			System.out.println(result.toString());
			return;
		}
		
		for(int i=0; i<n; i++) {
			result.add(arr.remove(i));
			reculsion(arr, result, n-1, r-1);
			//결과 리스트에 있던 것을 다시 원본 리스트로 옮겨준다.
			arr.add(i, result.remove(result.size() -1));
		}
	}
	
}
