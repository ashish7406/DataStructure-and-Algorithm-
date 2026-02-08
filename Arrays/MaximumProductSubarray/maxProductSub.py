# 

def maxProdu(nums):
    max_Prduct = nums[0]
    min_Product=nums[0]
    result=nums[0]
    for i in range(1,len(nums)):
        if nums[i]>0:
            max_Prduct= max(nums[i],max_Prduct*nums[i])
            min_Product=min(min_Product*nums[i],nums[i])
            
        else:
            temp=max_Prduct
            max_Prduct=max(min_Product*nums[i], nums[i])
            min_Product=min(temp*nums[i], nums[i])
        result=max(result,max_Prduct)
    return result


nums =[2,3,-2,4]
result = maxProdu(nums)
print("Maximum Product subarray  :", result) 