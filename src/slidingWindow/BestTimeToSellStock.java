package slidingWindow;

public class BestTimeToSellStock {

	public static void main(String[] args) {
		int[] arr = {2,1,2,1,0,1,2};
		int profit = maxProfit(arr);
		System.out.println(profit);
	}

	private static int maxProfit(int[] arr) {
		int buy = 0, sell = 1;
		int  maxProfit = 0;
		while (buy<arr.length && sell <arr.length) {
			if (arr[buy] > arr[sell]) {
				buy=sell;
				sell++;
			} else {
				if ((arr[sell] - arr[buy]) > maxProfit) {
					maxProfit = arr[sell] - arr[buy];
				}
			sell++;	
			}
		}

		return maxProfit;
	}

}
