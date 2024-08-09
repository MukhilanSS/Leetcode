class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int remove=0;
        for(int i=1;i<intervals.length;i++)
        {
            int cur=intervals[i-1][1];
            while(i<intervals.length&&cur>intervals[i][0])
            {
                cur=Math.min(cur,intervals[i][1]);
                remove++;
                i++;
            }
        }
        return remove;
    }
}