class Solution {
    public List<List<Integer>> generate(int n) {
        // List<List<Integer>> a=new ArrayList<>();
        // int k ;
        // for(int i=1;i<=n;i++)
        // {
        //     k=1;
        //     List<Integer>b=new ArrayList<>();
        //     for(int j=1;j<=i;j++){
        //         b.add(k);
        //         k=k*(i-j)/j;
        //     }
        //     a.add(b);
        // }
        // return a;
        List<List<Integer>> ans=new ArrayList<>(Arrays.asList(
            Arrays.asList(1),Arrays.asList(1,1)));
        if(n==1)
        ans.remove(1);
        for(int i=2;i<n;i++){
            List<Integer> a=ans.get(i-1);
            List<Integer> b=new ArrayList<>();
            b.add(1);
            for(int j=0;j<a.size()-1;j++)
            {   
                b.add(a.get(j)+a.get(j+1));
            }
            b.add(1);
            ans.add(b);
        }
        return ans;
    }
}