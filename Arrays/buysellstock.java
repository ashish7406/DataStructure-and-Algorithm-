package arraysexamples;

public class buysellstock {
	
	 public static int maxProfit(int[] prices) {
		 int currentValue=prices[0];
		 
		 int ans=0;
		 for(int i=1;i< prices.length;i++) 
		 
		 {
			 int profit=prices[i]-currentValue;
			 
			 if(profit>ans) {
				 ans=profit;
			 }
			 currentValue=Math.min(prices[i],currentValue );
			 
			 
		 }
		 
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}

}
