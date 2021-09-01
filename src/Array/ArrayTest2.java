package Array;

/**
 * @Auther Eternal
 * @Date 2021/8/30
 * 买卖股票的最佳时机 II
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] prices = new int[] {1, 2, 3, 4, 5};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] < prices[i + 1]) {
                max = max + prices[i + 1] - prices[i];
                System.out.println(max);
            }
        }

        return max;
    }

}