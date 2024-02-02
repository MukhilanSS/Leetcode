class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            int num=i;
            for(int j=i+1;j<=9;j++)
            {
                num=num*10+j;
                if(num>=low && num<=high)
                ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
        // int i=1;
        // int b=10;
        // while(i<=high)
        // {
        //     i=i*10+(i+1)*(1*b);
        //     i=i+
        //     if(i>=low)
        //     {
        //         ans.append(i);
        //     }

        // }
        // String num="123456789";
        // String one="111111111";
        // int a=Integer.parseInt(num.substring(0,Integer.toString(low).length()));
        // int b=Integer.parseInt(one.substring(0,Integer.toString(a).length()));
        // ans.add(a);
        // while(a<high)
        // {
            // a+=b;
        //     if(a>high && a%100!=0)
        //     ans.add(a);
        // }
