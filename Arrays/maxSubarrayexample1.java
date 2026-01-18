package arraysexamples;

public class maxSubarrayexample1 {
	
	public static int maxSubArray(int [] nums) {
		int currentSum=nums[0];
		int maxSum=nums[0];
		for (int i=1;i<nums.length;i++) {
			
			
			if(currentSum<0) {
				currentSum=0;
			}
			currentSum=currentSum+nums[i];
			
			if(currentSum > maxSum) {
				maxSum=currentSum;
			}
			
		}
		return maxSum;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray(arr));

	}

}
