package com.prakharjain.array;

import java.util.Scanner;

public class NewYearProblem {
	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	
        int temp;
        int j=0;
        while(j<2)
        {
            for(int i=0; i<q.length-1; i++)
            {
                if(q[i]>q[i+1])
                {
                    temp = q[i];
                    q[i]=q[i+1];
                    q[i+1]=temp;
                }
            }
            for(int k=0; k<q.length; k++)
            {
                System.out.print(q[k]);

            }
            System.out.println();
            j++;
        }    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int[] q = {2,1,5,3,4};
    	minimumBribes(q);
        /*int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
*/    }
}
