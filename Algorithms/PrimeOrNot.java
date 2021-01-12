/****************************************************************************************************
Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime

*****************************************************************************************************/








import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeOrNot {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t--!=0)
        {
            int n=s.nextInt();
            if(n==2||n==3)
            {
                System.out.println("Prime");
                continue;
            }
            if(n==1||n%2==0)
            {
                System.out.println("Not prime");
                continue;
            }
            int f=0;
            for(int i=3;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
            {
                System.out.println("Not prime");
            }
            else
            {
                System.out.println("Prime");
            }
        }
    }
}



