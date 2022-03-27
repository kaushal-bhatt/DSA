package main;



public class SecondLargestNoInArray {
	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		
		int[] arr = {10,100, 6, 6};
		System.out.println("First Large No Index is : "+largest(arr));
		long b = System.currentTimeMillis();
		System.out.println("Second Largest NO Index is :" + SecondLargest(arr));
		System.out.println(b - a + " sec");
		
	}
	
	static int largest(int[] arr) {
		int largest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}
	static int SecondLargest(int [] arr){
		int result=-1;
		for(int i=0;i<arr.length;i++){
			if (arr[i] != arr[largest(arr)]) {
				if(result==-1){
					result=i;
				}
				else if(arr[i]>arr[result]){
					result=i;
				}
			}
		}
		return result;
	}

	
	
	
	
	
//	static int largest(int[] arr){
//		ArrayList<Integer> list= new ArrayList<>();
//		for(int element:arr){
//			list.add(element);
//		}
//
//		return Collections.max(list);
//	}
//	static int SecondLargest(int [] arr,int largest){
//		ArrayList<Integer> lists= new ArrayList<>();
//		for (int element:arr){
//			lists.add(element);
//		}
//		if(lists.contains(largest)){
//			lists.remove(lists.indexOf(largest));
//		}
//		System.out.println(lists);
//		return Collections.max(lists);
//	}
}
