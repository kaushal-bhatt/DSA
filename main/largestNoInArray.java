package main;

import java.util.*;

public class largestNoInArray {
	public static void main(String[] args) {
		long a=System.currentTimeMillis();
		
		int [] arr={10,5,20,8,6,7,4,99,54,45,45,2,2,23,5,23,23,45,9,88,6,6};
		System.out.println(solution(arr));
		long b= System.currentTimeMillis();
		System.out.println(b-a + " sec");
		
	}
	static int solution(int[] arr){
		ArrayList<Integer> list= new ArrayList<>();
		for(int asd:arr){
		list.add(asd);
		}
		return Collections.max(list);
	}
}
