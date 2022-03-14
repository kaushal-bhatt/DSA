package main;

import java.util.ArrayList;
import java.util.Collections;

public class largestNoInArray {
	public static void main(String[] args) {
		long a=System.currentTimeMillis();
		
		int [] arr={10,5,20,8,6,7,4,99,54,45,45,2,2,23,5,23,23,45,9,88,6,6};
		System.out.println(solution(arr));
		long b= System.currentTimeMillis();
		System.out.println(b-a);
		
	}
	static int solution(int[] arr){
		ArrayList<Integer> arrr = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++){
			arrr.add(arr[i]);
		}
		return Collections.max(arrr);
	}
}
