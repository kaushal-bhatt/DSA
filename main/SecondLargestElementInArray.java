package main;
/**optimise solution
 * */
public class SecondLargestElementInArray {
	public static void main(String[] args) {
		int [] arr={1,4,2,3,3,24,1};
		System.out.print(secondLarge(arr));
	}
	static int secondLarge(int [] arr){
		int result=-1;
		int largest=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[largest]){
				
				result=largest;
				largest=i;
			}
			else if(arr[i]!=arr[largest]){
				if(result==-1 || arr[i]>arr[result])
					
					result=i;
			}
		}
		return result;
	}
}
