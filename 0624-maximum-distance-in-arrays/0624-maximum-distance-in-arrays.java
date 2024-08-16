import java.util.List;
import java.util.PriorityQueue;
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n=arrays.size();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=0;
        int x=arrays.get(0).size();
        min=Math.min(min,arrays.get(0).get(0));
        max=Math.max(max,arrays.get(0).get(x-1));
        for(int i=1;i<n;i++)
        {
            x=arrays.get(i).size();
            int sm=arrays.get(i).get(0);
            int l=arrays.get(i).get(x-1);
            // System.out.println(sm+" "+l);
            ans=Math.max(ans,Math.abs(sm-max));
            ans=Math.max(ans,Math.abs(l-min));
            // System.out.println(ans);
            min=Math.min(min,sm);
            max=Math.max(max,l);
        }
        return ans;

    }
}
