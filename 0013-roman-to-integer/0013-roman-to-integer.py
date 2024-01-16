class Solution:
    def romanToInt(self, s: str) -> int:
        d={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        res=0
        for i in reversed(s):
            val=d[i]
            if 4*val<res:
                res-=val
            else:
                res+=val
        return res
