public class FindTimeForStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = 0;
        int prevStock = prices[0]; 
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < prevStock)
                prevStock = prices[i];
            if(profit < prices[i]-prevStock) profit=prices[i]-prevStock;
        }
        System.out.println(profit);
    }    
}
