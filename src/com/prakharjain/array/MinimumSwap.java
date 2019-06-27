package com.prakharjain.array;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MinimumSwap {
	
	
	static int minimumSwaps(int[] array) { //7,1,3,2,4,5,6
		int n = array.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < n; i++)
        {
        	if (i < array[i] - 1) {
            	swap(array, i, (array[i] - 1));
                minSwaps++;
                i--;
            }
        }
        return minSwaps;

    }
	
	
	private static void swap(int[] array, int i, int j) {
		System.out.println("I: "+array[i]+" J: "+j);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
	
	public static void main(String[] args)
	{
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /*int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
*/
  int[] arr = {7,1,3,2,4,5,6};
		int res = minimumSwaps(arr);
		System.out.println("MinSwap:"+res);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
       /*
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
*/	}
}
