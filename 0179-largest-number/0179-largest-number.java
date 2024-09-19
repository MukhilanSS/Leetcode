class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder s=new StringBuilder();
        String temp[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=Integer.toString(nums[i]);
        } 
        Arrays.sort(temp,(a,b)->(b+a).compareTo(a+b));
        if(temp[0].equals("0")) return "0";
        for(String str:temp)
        {
            s.append(str);
        }
        return s.toString();
    }
}