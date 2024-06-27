

public class BestTimeToBuyStocks {
    
    public static void profit(int [] prices){
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0;
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++){    
            buyPrice = Math.min(buyPrice,prices[i]);
            System.out.print(buyPrice+" ");
            sellPrice = prices[i];

            System.out.print(sellPrice);
            
            int profit = 0;
            if(buyPrice < sellPrice){
                profit = sellPrice - buyPrice;
            }

            maxProfit = Math.max(maxProfit, profit);

        }
        System.out.println();
        System.out.println("Max Profit : "+maxProfit);
    } 
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        profit(prices);
    }    
}
