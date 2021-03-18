class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0){return 0;}
        int p=nums[0];
        int sol=0;
        int t=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==p)
            {
                sol++;
                continue;
            }
            p=nums[i];
            nums[t]=p;
            t++;
        }
        return n-sol;
    }
}
