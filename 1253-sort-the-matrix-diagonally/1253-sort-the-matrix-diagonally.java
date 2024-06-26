class Solution {
    void sort(int mat[][],int row,int col,int m,int n){
        List<Integer> l=new ArrayList<>();
        int r=row,c=col;
        while(r<m&& c<n)
        {
            l.add(mat[r++][c++]);
        }
        Collections.sort(l);
        r=row;c=col;
        int k=0;
        while(r<m && c<n)
        {
            mat[r++][c++]=l.get(k++);
        }
    }
    public int[][] diagonalSort(int[][] mat) {
       
        //row
        int m=mat.length;
        int n=mat[0].length;
        for(int col=0;col<n;col++)
        {
            sort(mat,0,col,m,n);
        }
        //col
        for(int row=1;row<m;row++)
        {
            sort(mat,row,0,m,n);
        }
        return mat;
    }
    
}