class Solution {
    public int mukhil(int i,int j1,int j2,int r,int c,int grid[][],int memo[][][])
    {
        if(j1<0||j1>c||j2<0||j2>c)
        return -1;
        if(i==r-1)
        {
            if(j1==j2)
            return grid[i][j1];
            else
            return grid[i][j1]+grid[i][j2];
        }
        if(memo[i][j1][j2]!=-1)
        {
            return memo[i][j1][j2];
        }
        int max=-1;
        for(int x=-1;x<=1;x++)
        {
            for(int y=-1;y<=1;y++)
            {
                int value=0;
                if(j1==j2)
                value=grid[i][j1];
                else
                value=grid[i][j1]+grid[i][j2];
                value+=mukhil(i+1,x+j1,y+j2,r,c,grid,memo);
                max=Math.max(value,max);
            }
        }
        return memo[i][j1][j2]=max;
    }
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int memo[][][]=new int[r][c][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Arrays.fill(memo[i][j],-1);
            }
        }
        return mukhil(0,0,c-1,r,c-1,grid,memo);
    }
}