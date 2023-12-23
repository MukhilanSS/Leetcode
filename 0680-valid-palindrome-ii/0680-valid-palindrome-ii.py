class Solution:
    def validPalindrome(self, s: str) -> bool:
        def ispalin(s,i,j):
            while(i<j):
                if s[i]!=s[j]:
                    return False
                i+=1
                j-=1
            return True 
        i=0;
        j=len(s)-1
        while(i<j):
            if s[i]!=s[j]:
                return ispalin(s,i+1,j) or ispalin(s,i,j-1)
            i+=1
            j-=1
        return True
       