import java.util.*;
class Solution {
    static int val(char c)
    {
        if(c=='I')
        {
            return 1;
        }
        else if(c=='V')
        {
            return 5;
        }
        else if(c=='X'){
            return 10;
        }
        else if(c=='L'){
            return 50;
        }
        else if(c=='C')
        {
            return 100;
        }
        else if(c=='D')
        {
            return 500;
        }
        else
        {
            return 1000;
        }
    }
    public int romanToInt(String r) {
        int sol=0;
        int b=0;
        int c=0;
        int l=r.length();
        b=val(r.charAt(0));
        int i=1;
        while(i<r.length())
        {
            c=val(r.charAt(i));
            if(b<c)
            {
                sol-=b;
            }
            else
            {
                sol+=b;
            }
            
            b=c;
            i++;
        }
        sol+=c;
        if(l==1){return b;}
        return sol;
    }
}
