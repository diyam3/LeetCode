class Solution 
{
    public int oddCells(int m, int n, int[][] indices) 
    {
        int[][] res=new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                res[i][j]=0;
            }
        }
        int l=indices.length;
        int r,c;
        for(int i=0; i<l; i++)
        {
            r=indices[i][0];
            c=indices[i][1];
            for(int x=0; x<n; x++)
            {
                res[r][x]+=1;
            }
            for(int y=0; y<m; y++)
            {
                res[y][c]+=1;
            }
        }
        int count=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(res[i][j]%2!=0)
                count++;
            }
        }
        return count;
    }
}