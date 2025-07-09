class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet=set()
        left=0
        maxSize=0
        for right in range(len(s)):
            while s[right] in charSet:
                charSet.remove(s[left])
                left+=1
            charSet.add(s[right])
            maxSize=max(maxSize,right-left+1)
        return maxSize
        