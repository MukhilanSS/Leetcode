class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>ans=new ArrayList<>();
        int a,b,i=1;
        while(i<=9)
        {
            a=i;
            b=i+1;
            while(a<=high && b<=9)
            {
            a=a*10+b;
            if(a>=low && a<=high)
            ans.add(a);
            b++;
            }
            i++;
        }
        Collections.sort(ans);
        return ans;
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
    }
}