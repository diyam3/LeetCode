class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        int l=mat.length;
        int sum=0;
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                if(i==j || (i+j)==(l-1))
                {
                    sum=sum+mat[i][j];    
                }
                else
                continue;
            }
        }
        return sum;
    }
}