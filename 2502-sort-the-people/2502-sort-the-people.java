class Solution {
    static class Pair{
        String name;
        int height;
        Pair(String name,int height){
            this.name=name;
            this.height=height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        // List<Pair>list=new ArrayList<>();
        // int n=names.length;
        // for(int i=0;i<n;i++)
        // {
        //     list.add(new Pair(names[i],heights[i]));
        // }
        // list.sort((n1,n2)->n2.height-n1.height);
        // String ans[]=new String[n];
        
        // for(int i=0;i<n;i++)
        // {
        //     ans[i]=list.get(i).name;
        // }
        // return ans;
        PriorityQueue<Integer>heap=new PriorityQueue<>((n1,n2)->heights[n2]-heights[n1]);
        for(int i=0;i<heights.length;i++)
            heap.offer(i);
        String ans[]=new String[names.length];
        int k=0;
        while(!heap.isEmpty())
        {
            ans[k++]=names[heap.poll()];
        }
        return ans;
    }
}