class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean b;
        for(String w:words)
        {
            b=true;
            for(char c:w.toCharArray())
            {
                if(!allowed.contains(c+"")){
                //  System.out.println(c);
                 b=false;
                }    
            }
            if(b) count++;

        }
        return count;
    }
}