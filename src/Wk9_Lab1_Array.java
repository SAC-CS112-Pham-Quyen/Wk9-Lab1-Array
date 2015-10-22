

import java.util.Arrays;


public class Wk9_Lab1_Array {

	public static void main(String[] args ) {
		
		int[] aryNums;
		aryNums = new int[6];
		int average;
		
		aryNums[0] = 123;
		aryNums[1] = 456;
		aryNums[2] = 479;
		aryNums[3] = 135;
		aryNums[4] = 246;
		aryNums[5] = 135;
		
		Arrays.sort(aryNums);
		
		int p;
		
		for (p=0; p < aryNums.length; p++) {
			
			System.out.println("Number:" + aryNums[p]);
			
		}
		
		int total = 0;
				int i;
		for (i=0; i<aryNums.length; i++)
			total +=aryNums[i];
		{
			System.out.println("Total:" +total);
		}
		
		average = total /6;
		
		System.out.println("average:" +average);
		
	}
	
}
