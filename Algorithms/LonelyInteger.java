/* You will be given an array of integers. All of the integers except one occur twice. That one is unique in the array.

Given an array of integers, find and print the unique element.

For example,[0 0 1 2 1] , the unique element is 2. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LonelyInteger {

    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {
        int l=0;
        for(int i=0;i<a.length;i++)
        {
            int f=0;
            for(int j=0;j<a.length;j++)
            {
                if(j==i)
                {
                    continue;
                }
                if(a[i]==a[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                l=a[i];
                break;
            }
        }
        return l;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
