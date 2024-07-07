class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int ans=numBottles,rCount=0;
        // while(numBottles>=numExchange){
        //     rCount=(numBottles%numExchange);
        //     ans+=numBottles/numExchange;
        //     numBottles= (numBottles/numExchange)+rCount;
        // }

        return numBottles+(numBottles-1)/(numExchange-1);

    }
}