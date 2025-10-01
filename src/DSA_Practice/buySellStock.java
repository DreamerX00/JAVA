package DSA_Practice;

public class buySellStock {
    static int Solution(int[] arr){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int num : arr){
            minPrice = Math.min(minPrice,num);
            maxProfit = Math.max(maxProfit,num-minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(Solution(new int[] {2,8,1,14,6}));
    }
}
