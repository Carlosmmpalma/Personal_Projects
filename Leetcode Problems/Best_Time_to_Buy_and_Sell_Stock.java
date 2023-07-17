public class Best_Time_to_Buy_and_Sell_Stock {
  public int maxProfit(int[] prices) {
        
    int profit=0;
    int min=Integer.MAX_VALUE;

    for(int i=0; i<prices.length;i++){
  
      if(prices[i]<min) min=prices[i];

      if(prices[i]-min>profit) profit=prices[i]-min;
      
    }

    return profit;
  }
}
