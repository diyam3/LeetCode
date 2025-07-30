class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int l=accounts.length;
        int[] wealth=new int[l];
        for(int i=0; i<l; i++)
        {
            int s=0;
            int l1=accounts[i].length;
            for (int j=0; j<l1; j++)
            {
                s+=accounts[i][j];
            }
            wealth[i]=s;
        }
        for (int i = 0; i < l - 1; i++) 
        {
            for (int j = 0; j < l - i - 1; j++) 
            {
                if (wealth[j] > wealth[j + 1]) 
                {
                    int temp = wealth[j];
                    wealth[j] = wealth[j + 1];
                    wealth[j + 1] = temp;
                }
            }
        }
        return wealth[l-1];
    }
}