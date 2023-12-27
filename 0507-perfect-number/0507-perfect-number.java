class Solution {
    public boolean checkPerfectNumber(int N) {
       long count=0;
        // N=10;
        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
                count+=i;
            if(N/i!=N)
                count+=N/i;
            }
        // System.out.println("ki"+count);

        }
        // System.out.println(count);
        if(count==N)
        return true;
        else
        return false;
    }
}