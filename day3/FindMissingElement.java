package week.day3;

import java.util.Arrays;
public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 4,3,2,8, 6, 7}; 
		int missingnumber = -1;
		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] != i+1) {
				missingnumber = i+1;
		        System.out.println("Missing Number in the given array is "+missingnumber);
		        break;
	}

}
}
	}