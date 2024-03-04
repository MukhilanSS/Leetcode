class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int max=0;
        int i=0;
        int j=tokens.length-1;
        Arrays.sort(tokens);
        while(i<=j)
        {
            if(tokens[i]<=power)
            {
                power-=tokens[i];
                score++;
                i++;
                max=Math.max(max,score);
            }
            else if(score>=1)
            {
                power+=tokens[j];
                score--;
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return max;
    }
}