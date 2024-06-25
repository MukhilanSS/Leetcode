class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
        int count=1;
        int top=0,down=n-1,left=0,right=n-1;
        while(top<=down && left<=right){
            for(int i=left;i<=right;i++)
            {
                ans[top][i]=count++;
            }
            top++;
            for(int i=top;i<=down;i++)
            {
                ans[i][right]=count++;
            }
            right--;
            if(top<=down)
            {
                for(int i=right;i>=left;i--)
                {
                    ans[down][i]=count++;
                }
                down--;
            }
            if(left<=right)
            {
                for(int i=down;i>=top;i--)
                {
                    ans[i][left]=count++;
                }
                left++;
            }

        }
        return ans;
    }
}