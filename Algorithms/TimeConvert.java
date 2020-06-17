/*Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConvert{

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String t[]=s.split(":");
         int h=Integer.parseInt(t[0]);
         int m=Integer.parseInt(t[1]);
         int se;
         String out;
         if(t[2].charAt(2)=='P')
         {
             String[] temp=t[2].split("P");
             se=Integer.parseInt(temp[0]);
             if(h!=12)
             {
                 h+=12;
             }
         }
         else
         {
             String[] temp=t[2].split("A");
             se=Integer.parseInt(temp[0]);
             if(h==12)
             {
                 h=0;
             }
         }
         out=(h<=9)?"0"+String.valueOf(h)+":":String.valueOf(h)+":";
         out+=(m<=9)?"0"+String.valueOf(m)+":":String.valueOf(m)+":";
         out+=(se<=9)?"0"+String.valueOf(se):String.valueOf(se);
        return out;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
