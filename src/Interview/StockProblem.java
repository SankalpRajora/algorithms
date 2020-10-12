package Interview;

public class StockProblem {

    public static void main(String[] args){

        int[] prices = { 54,2,10, 20, 30, 50};
        int minPrice = prices[0];
        int maxPrice = prices[0];
        int buyDay = 0;
        int sellDay = 0;

        for(int i=0; i<prices.length ; i++){
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
                buyDay = i;
            }

            if(prices[i] < minPrice){
                minPrice = prices[i];
                sellDay = i;
            }

        }

        System.out.println("Buy Day is:"+buyDay+", price is"+maxPrice);
        System.out.println("Selling Day is:"+sellDay+", price is"+minPrice);

        int myStock = 0;
        int profit = 0;

        if(sellDay > buyDay){
            // we cann't sell
            //we will buy first
            myStock = prices[buyDay];
        }
        if(myStock != 0 )
        {
            //sell the stock
            profit =  myStock - prices[sellDay];
            myStock = 0;
        }

        System.out.println("My profit:"+profit);

    }

}
