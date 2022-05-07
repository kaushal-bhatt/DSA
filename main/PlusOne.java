package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
	public static void main(String[] args) {
		int N = 3;
		ArrayList<Integer> arr = new ArrayList<>(N);
		arr.add(9);
		arr.add(9);
		arr.add(9);
		System.out.println(increment(arr, N));
	}
	
	static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
		// code here
//			int total=0;
//			ArrayList<BigDecimal> array_list = new ArrayList<>();
//			for (Integer i : arr) { // assuming list is of type List<Integer>
//				total = 10*total + i;
//			}
//			int result=total+1;
//			String temp = Integer.toString(result);
//			BigDecimal[] numbers = new BigDecimal[temp.length()];
//			for (int i = 0; i < temp.length(); i++) {
//				numbers[i] = BigDecimal.valueOf(temp.charAt(i) - '0');
//			}
//			array_list.addAll(Arrays.asList(numbers));
//			return (int)array_list;
			// code here
			int lastElement=N-1;
			if(arr.get(lastElement)<9){
				arr.set(lastElement, arr.get(lastElement)+1);
				return arr;
			}
			else{
				while(lastElement>=0 && arr.get(lastElement)==9){
					arr.set(lastElement,0);
					if(lastElement==0)
						arr.add(lastElement,1);
					
					lastElement--;
				}
			}
			if(lastElement>-1)
				arr.set(lastElement,arr.get(lastElement)+1);
			
		return arr;
	}
	}