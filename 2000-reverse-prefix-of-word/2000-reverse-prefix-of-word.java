class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch),i=0,j=n;
        StringBuilder s=new StringBuilder(word);
        while(i<j){
            char temp=word.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            j--;
            i++;
        }
        return s.toString();
    }
}
// class Solution {
//     public String reversePrefix(String word, char ch) {
//         int firstOccurence = word.indexOf(ch);
//         if(firstOccurence == -1){
//             return word;
//         }
        
//         StringBuilder prefix = new StringBuilder(word.substring(0, firstOccurence+1));
//         return prefix.reverse().toString() + word.substring(firstOccurence+1);
//     }
// }