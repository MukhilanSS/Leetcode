class Solution {
    public int numTeams(int[] rating) {
        int sum=0;
        for(int i=1;i<rating.length-1;i++)
        {
            int lcount=0,rcount=0;
            int k=i-1,x=i+1;
            while(k>=0){
                if(rating[i]>rating[k]) 
                {
                    lcount++;
                }
                k--;
            }
            while(x<=rating.length-1){
                if(rating[i]<rating[x])
                {
                    rcount++;
                }
                x++;
            }
            sum+=(rcount*lcount);
            int leftLarger=i-lcount;
            int rightSmaller=rating.length-1-i-rcount;
            sum+=(leftLarger*rightSmaller);
        }
        return sum;
    }
}