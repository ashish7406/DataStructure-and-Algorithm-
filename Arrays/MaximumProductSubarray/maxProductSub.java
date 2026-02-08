public class maxProductSub {
	
public static int maxProduct(int[] nums) {
	
	if(nums==null || nums.length==0) {
		return 0;
		
	}
	
	int maxProd=nums[0];
	int minProd=nums[0];
	int res=nums[0];
	
	for (int i=1;i<nums.length;i++) {
		
		if(nums[i]>=0) {
			maxProd=Math.max(nums[i],nums[i]*maxProd);
			minProd=Math.min(nums[i],nums[i]*minProd);
			
		}
		else {
			int tem=maxProd;
			maxProd=Math.max(nums[i],nums[i]*minProd);//-2//24
			minProd=Math.min(nums[i],nums[i]*tem);//-6
			
		}
		res=Math.max(res,maxProd);//
		
	}
	
	return res;
        
    }

	public static void main(String[] args) {
		
		int [] arr={-2,3,-4};
		System.out.println(maxProduct(arr));
		// TODO Auto-generated method stub

	}

}
