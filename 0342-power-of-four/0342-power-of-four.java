class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        else if(n%4!=0 || n==0)
            return false;
        n=n/4;
        return isPowerOfFour(n);
    // return (Math.log10(n)/Math.log10(4)%1==0);

    }
}