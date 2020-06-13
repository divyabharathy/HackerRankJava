/*Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrintStairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        int space=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int k=0;k<space;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("#");
            }
            System.out.println();
            space--;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
