class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> a=new ArrayList<>();
        int k ;
        for(int i=1;i<=n;i++)
        {
            k=1;
            List<Integer>b=new ArrayList<>();
            for(int j=1;j<=i;j++){
                b.add(k);
                k=k*(i-j)/j;
            }
            a.add(b);
        }
        return a;
    }
}