class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ml=Integer.MAX_VALUE;
        int l=0;
        int curr=0;
        for(int i=0; i<nums.length; i++){
            curr+=nums[i];
            while(curr>=target){
                if(i-l+1<ml) ml=i-l+1;
                curr-=nums[l];
                l++;
            }
        }
        return ml!=Integer.MAX_VALUE? ml:0;
    }
}