/* Given two integers, l and r, find the maximal value of a xor b, written , where  and  satisfy the following condition:
l<=a<=b<=r

For example, if l=11 and r=12, then
11^11=0
11^12=7
12^12=0
Our maximum value is  7*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximizingXors {

    // Complete the maximizingXor function below.
    static int maximizingXor(int l, int r) {
        int max=0;
        for(int i=l;i<r;i++)
        {
            for(int j=i+1;j<=r;j++)
            {
                if((i^j)>max)
                {
                    max=i^j;
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = maximizingXor(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
