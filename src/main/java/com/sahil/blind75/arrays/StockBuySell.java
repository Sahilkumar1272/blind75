package com.sahil.blind75.arrays;

public class StockBuySell {
    public int maxProfitNaive(int[] prices) {
        int maxProfit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]-prices[i]>maxProfit) maxProfit=prices[j]-prices[i];
            }
        }
        return maxProfit;

    }
    public int maxProfitOptimal(int[] prices) {
        int maxProfit=0;
        int buyPrice=prices[0];
        int n=prices.length;
        for(int i=1;i<n;i++){
            maxProfit=Math.max(maxProfit,prices[i]-buyPrice);
            buyPrice=Math.min(buyPrice,prices[i]);
        }
        return maxProfit;

    }

}
