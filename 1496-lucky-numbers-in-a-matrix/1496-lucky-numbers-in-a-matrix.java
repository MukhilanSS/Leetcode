class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int min;
        for(int a[]:matrix)
        {
            min=Integer.MAX_VALUE;
            for(int j:a)
            {
                min=Math.min(min,j);
            }
            list.add(min);
        }
        int max;
        for(int j=0;j<matrix[0].length;j++){
            max=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++)
            {
                max=Math.max(max,matrix[i][j]);
            }
            if(list.contains(max))
                ans.add(max);
        }
        return ans;
    }
}