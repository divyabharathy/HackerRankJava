/*Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxMinSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int min=arr[0];
        int max=0;
        long maxsum=0,minsum=0;
        for(int i:arr)
        {
            if(i<min)
            {
                min=i;
            }
            if(i>max)
            {
                max=i;
            }
        }
        for(int i:arr)
        {
            if(i==max)
            {
                max=0;
                continue;
            }
            else
            {
                minsum+=i;
            }
        }
        for(int i:arr)
        {
            if(i==min)
            {
                min=0;
                continue;
            }
            else
            {
                maxsum+=i;
            }
        }
        System.out.println(minsum+" "+maxsum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
