package arraysexamples;

public class buysellstock {
	
	 public static int maxProfit(int[] prices) {
		 int currentValue=prices[0];
		 
		 int ans=0;
		 for(int i=1;i< prices.length;i++) 
		 {
			 int profit=prices[i]-currentValue;//1-7,5-1
			 if(profit>ans) {//-6>1,4>1,
				 ans=profit;//ans=4
			 }
			 //ans=0
			 currentValue=Math.min(prices[i],currentValue );
			 //currentValue=1
		 }
		 
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}

}
