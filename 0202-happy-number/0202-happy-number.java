class Solution {
    public int square(int n){
            int sum=0;
            while(n>0)
            {
                int r=n%10;
                sum+=r*r;
                n/=10;
            }
            return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);

     return slow==1;
    }
}