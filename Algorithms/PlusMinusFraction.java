/*Output Format

You must print the following  3 lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
Sample Input
6
-4 3 -9 0 4 1 

Sample Output
0.500000
0.333333
0.166667*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinusFraction {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n=arr.length;
        double p=0.000000,ne=0.000000,z=0.000000;
        for(int i:arr)
        {
            if(i>0)
            {
                p++;
            }
            else if(i<0)
            {
                ne++;
            }
            else
            {
                z++;
            }
        }
        System.out.println(String.format("%.6f",p/n));
        System.out.println(String.format("%.6f",ne/n));
        System.out.println(String.format("%.6f",z/n));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
