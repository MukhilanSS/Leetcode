class Solution {
    public char repeatedCharacter(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            return c;
            else{
                map.put(c,1);
            }
        }
        return ' ';
    }
}