class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // int count=0;
        // while(left!=right){
        // left>>=1;
        // right>>=1;
        // count++;
        // }
        // // System.out.print(left&right);
        // return left<<count;
        while(right>left)
            right=right&(right-1);
        return right;
    }
}