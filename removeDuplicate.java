class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){return 0;}
        int t=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[t])
            {
                continue;
            }
            nums[++t]=nums[i];
        }
        return t+1;
    }
}
