package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOfAnArray {
	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5,6};
		List<?> a= Arrays.asList(arr);
		Collections.reverse(a);
		System.out.println(arr);
	}
}
