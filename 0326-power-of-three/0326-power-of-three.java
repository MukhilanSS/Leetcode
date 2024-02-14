class Solution {
    public boolean isPowerOfThree(int n) {
    // int flag=0;
    //     while((n&(n-1))==0 && n>0)
    //     flag++;
    //     // System.out.print()
    // if(flag>=2)
    // return true;
    // return false;
    if(n==1)
    return true;
    else if(n%3!=0 || n<=0)
    return false;  
    n=n/3;
    return isPowerOfThree(n);
    // return (Math.log10(n)/Math.log10(3)%1==0);
    }
}