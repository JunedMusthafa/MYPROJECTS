import java.util.Scanner;
public class stocks {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no prices : ");
    int n=sc.nextInt();
    int[] prices = new int[n];
    System.out.println("Enter the prices: ");
    for(int i=0;i<n;i++){
        prices[i]=sc.nextInt();
    }
    
    System.out.println("Maximum profit : "+buy_and_sell_stock(prices, n));
  
    
    sc.close();
    }
    static int buy_and_sell_stock(int[] prices,int n){
        int buy=Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(buy<prices[i]){
                int profit = prices[i]-buy;
                maxProfit=Math.max(maxProfit,profit);
            }
            else
                buy = prices[i];
        }
        return maxProfit;
    }
  
   
}
