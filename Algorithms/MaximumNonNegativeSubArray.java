public class Solution {
    public static long sum(String s)
    {
        if(s.length()==0)
        {
            return 0;
        }
        String[] t=s.split(" ");
        int n=t.length;
        long v=0;
        int i=0;
        while(i<n)
        {
            v+=Integer.parseInt(t[i]);
            i++;
        }
        return v;
        
    }
    public int[] maxset(int[] A) {
        int n=A.length;
        String sol="";
        String temp="";
        for(int i=0;i<=n;i++)
        {
            if(i==n||A[i]<0)
            {
                if(sum(temp)>sum(sol))
                {
                     sol=temp;
                }
                else if(sum(temp)==sum(sol)&&temp.length()>sol.length())
                {
                    sol=temp;
                }
                temp="";
            }
            else
            {
                temp+=String.valueOf(A[i])+" ";
            }
        }
        if(sol.length()==0)
        {
            int[] a=new int[0];
            return a;
        }
        String[] solution=sol.split(" ");
        int len=solution.length;
        int[] a=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=Integer.parseInt(solution[i]);
        }
        return a;
        
    }
}
