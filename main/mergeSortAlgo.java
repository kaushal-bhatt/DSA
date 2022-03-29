package main;

import java.util.Arrays;

public class mergeSortAlgo {
	public static void main(String args[]) {
		int[] arr={5, 1, 6, 2, 3, 4};
		
		System.out.println(Arrays.toString(arr) + " Array before sorting ");
		mergesort(arr,arr.length);
//		sorting(arr);
	}
//	static void sorting(int[] list){
//		Arrays.sort(list);
//		System.out.println(Arrays.toString(list));
//	}
	//T(n) = 2T(n/2) + O(n) complexity which is O(nLogn)
	static void mergesort(int [] list,int n){
		
		if(n<2){
			return;
		}
		int midindex=n/2;
		int [] left=new int[midindex];
		int [] right=new int[n-midindex];
		
		for (int i=0;i<midindex;i++){
			left[i]=list[i];
		}
		for(int i=midindex;i<n;i++){
			right[i-midindex]=list[i];
		}
		mergesort(left,midindex);
		mergesort(right,n-midindex);
		merge(list,left,right,midindex,n-midindex);
		
		
	}
	static void merge(int[] list,int[] left,int [] right,int leftmidindex,int rightmidindex){
		int i=0,j=0,k=0;
		while (i < leftmidindex && j < rightmidindex){
			if(left[i] <= right[j]){
				list[k++]=left[i++];
			}
			else{
				list[k++]=right[j++];
			}
		}
		while(i < leftmidindex){
			list[k++]=left[i++];
		}
		while(j<rightmidindex){
			list[k++]=right[j++];
		}
		System.out.println(Arrays.toString(list));
	}
	
}