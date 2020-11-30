import java.math.*;;
public class Solution {
    public String solve(int A) {
         BigInteger fact=new BigInteger("1");
      while(A!=0)
        {
            fact=fact.multiply(BigInteger.valueOf(A));
            
            A--;
        }
        return fact.toString();
    }
}
