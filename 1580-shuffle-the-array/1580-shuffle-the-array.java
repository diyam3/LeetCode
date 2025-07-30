class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] arr=new int[2*n];
        int j=1;
        int k=0;
        for (int i=0; i<(2*n); i++)
        {
            if(i>n-1)
            {
                arr[j]=nums[i];
                j+=2;
            }
            else
            {
                arr[k]=nums[i];
                k+=2;
            }
        }
        return arr;
    }
}