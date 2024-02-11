class Solution {
    public int fibo(int n,Map<Integer,Integer>memo)
    {
        if(n<=1)
        return n;
        if(memo.containsKey(n))
        return memo.get(n);
        int result;
        result=fibo(n-1,memo)+fibo(n-2,memo);
        memo.put(n,result);
        return result;
    }
    public int fib(int n) {
        Map<Integer,Integer>map=new HashMap<>();
        int result=fibo(n,map);
        return result;
    }
}