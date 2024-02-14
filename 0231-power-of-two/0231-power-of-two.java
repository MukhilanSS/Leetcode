class Solution {
    public boolean isPowerOfTwo(int n) {
        // System.out.println(Math.log10(n));
        // System.out.println(Math.log10(2));
        // System.out.print(Math.log10(n)/Math.log10(2));
        if(n==1)
            return true;
        else if(n%2!=0 || n==0)
            return false;   
        n/=2;
        return isPowerOfTwo(n);
        // if((n&(n-1))==0 && n>0)
        // return true;
        // return false;
        // return (Math.log10(n)/Math.log10(2)%1==0);
    }
}