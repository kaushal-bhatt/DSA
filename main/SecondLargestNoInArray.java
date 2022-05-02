package main;

public class SecondLargestNoInArray {
		public static void main(String[] args) {
			int [] arr ={4,2,3,6,7,9,8};
			int Secondlargest=fetchSecondLargest(arr);
			System.out.println(arr[Secondlargest]);
		}
		static int fetchSecondLargest(int [] arr){
			int largest=0;// 3 4 5
			int result=-1;// 1 2 0 3 4 6
			for(int i=1;i<arr.length;i++){
				if(arr[i]>arr[largest]){//checks second element in array is greater then first or not , if true then make assign largest element index to current index i and previous largest assigned to result
					result=largest;
					largest=i;
				}
				else if(arr[i]!=arr[largest]){//this line means array is not contains only 1 element
					if(result==-1 || arr[i]>arr[result]){//if result == -1 means arr[i] is not greater than arr[largest],|| or if arr[i]>arr[result] means next element is greater the previous largest element than only assign result =i
						result=i;
					}
				}
			}
			return largest;
		}
		
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