class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer>map=new HashMap<>();
        int count=0;
        for(char c:jewels.toCharArray()){
            map.put(c,0);
        } 
        for(char c:stones.toCharArray()){
            if(map.containsKey(c)){
                count++;
            }

        }
    return count;
    }
}