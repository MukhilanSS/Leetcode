class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0,j=0;
        while(i<n)
        {
            int count=1;
            char temp=chars[i];
            while(i+1<n && chars[i]==chars[i+1])
            {
                count++;
                i++;    
            }
            if(count==1)
            {
                chars[j++]=temp;
            }
            else{
                if(count>1)
                {   
                    chars[j++]=temp;
                    String countlength=count+"";
                    for(int k=0;k<countlength.length();k++){
                            chars[j++]=countlength.charAt(k);
                    }
                }
            }
            i++;
        }       
        return j;
    }
}