package DSA_Basics;

public class buySellStock {
	//Brute Force Method
	static int maxProfitBrute(int[] prices) {
		 int max = 0;

	        for(int i = 0; i < prices.length; i++){
	            for(int j = i+1; j < prices.length; j++){
	                int curr = prices[j] - prices[i];
	                max = Math.max(curr,max);
	                System.out.println("=================");
	                System.out.println("Buy On Day : "+i+"\nSell On Day : "+j+"\n");
	                System.out.println((curr > 0) ? ("Profit = "+curr):("Loss = "+curr));
	                
	            }
	        }
	        
	        System.out.println("Max Profit = "+max);
	        System.out.println("=================");
	        return max;
	}
	
	//Optimized Approach
	static int maxProfitOptimized(int[] prices) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int price : prices) {
			
			System.out.print("Current Min Price  = ");
			min = Math.min(min, price);
			System.out.println(min);
			System.out.print("Current Profit     = ");
			max = Math.max(max, (price - min));
			System.out.println(max);
			
		}
		
		System.out.print("===================\n Max Profit Is : "+max+"\n===================");
		return max;
	}
	
	public static void main(String[] args) {
		maxProfitBrute(new int[]{7,1,5,3,6,4});
		maxProfitOptimized(new int[]{7,1,5,3,6,4});
	}

}
