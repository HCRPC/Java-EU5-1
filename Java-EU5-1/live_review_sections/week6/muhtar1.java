package week6;

import java.util.Arrays;

public class muhtar1 {

	public static void main(String[] args) {

		   int[] arr1 ={1,2,3};
	        int[] arr2 = {4,5,6,7};
	        
	        int[] arr3 = new int[arr1.length+arr2.length];
	        for (int i = 0; i < arr1.length; i++) {
				arr3[i]=arr1[i];
			}
	        for (int i = arr1.length; i < arr3.length; i++) {
				arr3[i]=arr2[i-arr1.length];
			}
	        
	        
	        System.out.println(Arrays.toString(arr3));
		
		
		
	}

}
