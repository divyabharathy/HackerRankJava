public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int iend=A.length;
        int jend=A[0].length;
        int l=iend*jend;
        int[] sol=new int[l];
        int i=0,j=0;
        int ind=0;
        int h=1;
        int istart=0,jstart=0;
        while(ind<l)
        {
            if(h==1)
            {
                while(j<jend)
                {
                sol[ind++]=A[i][j++];
                }
                i++;
                istart++;
                j--;
                h=0;
            }
            else if(h==0)
            {
                while(i<iend)
                {
                sol[ind++]=A[i++][j];
                }
                jend--;
                i--;
                j--;
                h=-1;
            }
            else if(h==-1)
            {
                while(j>=jstart)
                {
                    sol[ind++]=A[i][j--];
                }
                j++;
                iend--;
                i--;
                h=2;
            }
            else
            {
                while(i>=istart)
                {
                    sol[ind++]=A[i--][j];
                }
                i++;
                jstart++;
                j++;
                h=1;
            }
        }
        return sol;
        
    }
}
