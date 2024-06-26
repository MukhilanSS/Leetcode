class Solution {
    void sort(int mat[][],int row,int col,int m,int n){
        // List<Integer> l=new ArrayList<>();
        int l[]=new int[101];
        int r=row,c=col;
        while(r<m&& c<n)
        {
            // l.add(mat[r++][c++]);
            l[mat[r++][c++]]++;
        }
        // Collections.sort(l);
        r=row;c=col;
        // int k=0;
        for(int i=1;i<101;i++)
        {
            if(l[i]>0)
            {
                int count=l[i];
                while(count-->0)
                {
                    mat[r++][c++]=i;
                }
            }
        }
        // while(r<m && c<n)
        // {
        //     mat[r++][c++]=l.get(k++);
        // }
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