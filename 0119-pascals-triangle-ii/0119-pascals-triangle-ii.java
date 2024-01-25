class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> ans=new ArrayList<>(Arrays.asList(
            Arrays.asList(1),Arrays.asList(1,1)));
        if(n==1)
        return Arrays.asList(1,1);
        for(int i=2;i<=n;i++){
            List<Integer> a=ans.get(i-1);
            List<Integer> b=new ArrayList<>();
            b.add(1);
            for(int j=0;j<a.size()-1;j++){
                b.add(a.get(j)+a.get(j+1));
            }
            b.add(1);
            ans.add(b);
        }
    return ans.get(n);
    }
}
