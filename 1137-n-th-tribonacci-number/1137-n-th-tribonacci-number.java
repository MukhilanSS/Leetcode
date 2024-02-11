class Solution {
    public int tribo(int n,Map<Integer,Integer>memo)
    {
        if(n==0)
        return 0;
        if(n<=2)
        return 1;
        if(memo.containsKey(n))
        return memo.get(n);
        int result;
        result=tribo(n-1,memo)+tribo(n-2,memo)+tribo(n-3,memo);
        memo.put(n,result);
        return result;
    }
    public int tribonacci(int n) {
        return tribo(n,new HashMap<>());
    }
}