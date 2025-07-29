class Solution {
    public int[] runningSum(int[] nums) 
    {
        int l=nums.length;
        int[] runningSum=new int[l];
        for (int i=0; i<l; i++)
        {
            int s=0;
            for(int j=0; j<=i; j++)
            {
                s=s+nums[j];
            }
            runningSum[i]=s;
        }
        return runningSum;
    }
}