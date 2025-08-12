class Solution {
    public int arrangeCoins(int n) {
        int low=1,high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long CoinsAtMid=(long)mid*(mid+1)/2;   //long is must.
            if(CoinsAtMid > n)
            {
                high=mid-1;
            }
            else if(CoinsAtMid < n)
            {
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return high;
    }
}