class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        boolean arr[]=new boolean[51];
        int xor=0;
        for(int n:nums)
        {
            xor^=n;
            arr[n]=true;
        }
        for(int i=0;i<51;i++)
        {
            if(arr[i]) xor^=i;

        }
        return xor;
    }
}