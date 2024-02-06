class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char a[]=new char[26];
            for(char c:s.toCharArray())
            a[c-'a']++;
            String grp=new String(a);
            if(!map.containsKey(grp))
            map.put(grp,new ArrayList<>());
            map.get(grp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}


// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//      List<List<String>>ans=new ArrayList<List<String>>();
//      Map<String,List<String>>map=new HashMap<String,List<String>>();
//      for(String s:strs)
//      {
//          char c[]=s.toCharArray();
//          Arrays.sort(c);
//          if(map.containsKey(new String(c)))
//          {
//              map.get(new String(c)).add(s);
//          }
//          else
//          {
//              List<String>a=new ArrayList<>();
//              a.add(s);
//              map.put(new String(c),a);
//          }
//      }   
//          for(String s:map.keySet())
//          ans.add(map.get(s));
//          return ans;
//     }
// }