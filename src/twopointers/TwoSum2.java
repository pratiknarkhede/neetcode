package twopointers;

import java.util.Arrays;

public class TwoSum2 {

	public static void main(String[] args) {
		int[] arr= {-2,0,2};
		int target=0;
		int[] sol=twoSum(arr,target);
		System.out.println(Arrays.toString(sol));
	}

	private static int[] twoSum(int[] arr,int target) {
		int i=0,j=arr.length-1;
		int[] sol=new int[2];
		while(i<j ) {
			if(arr[i]+arr[j]==target) {
				sol[0]=i;
				sol[1]=j;
				return sol;
			}else if((arr[i]+arr[j])>target) {
				j--;
			}else {
				i++;
			} 
			
		}
		return sol;
	}

}
