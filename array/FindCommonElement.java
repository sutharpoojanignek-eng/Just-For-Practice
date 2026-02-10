package array;

import java.util.Arrays;

public class FindCommonElement {

	public static void main(String[] args) {
		/*
		 * Find Common Elements in Two Arrays
		 * 
		 * Input: [1, 2, 3, 4] [3, 4, 5, 6] 
		 * Output: 3 4
		 * 
		 */
		
		int[] frstArr = {1, 2, 3, 4, 5, 3, 145, 19, 49, 16, 14, 128, 25, 67, 38};
		int[] secndArr = {3, 4, 5, 6, 7, 86, 36, 49, 79, 63, 111, 25, 6, 19, 116};
		
		Arrays.sort(frstArr);
		Arrays.sort(secndArr);
		
		for(int i = 0; i < frstArr.length; i++) {
			for(int j = 0; j < secndArr.length; j++) {
				if(frstArr[i] == secndArr[j]) {
					System.out.print(frstArr[i]+" ");
				}
			}
		}
		System.out.println();
		
		int common=0;
		
		for(int i = 0; i<frstArr.length; i++) {
			int num = frstArr[i];
			if(Arrays.binarySearch(secndArr, num)>=0) {
				if(secndArr[Arrays.binarySearch(secndArr, num)] == frstArr[i]) {
					System.out.print(frstArr[i]+" ");
				}
			}
			
		}
		System.out.println(common);
	}

}
