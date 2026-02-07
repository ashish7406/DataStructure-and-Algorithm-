def bestsellstock(prices):
 min_Value=prices[0]
 max_profit=0
 i=1
 for i in range(len(prices)):
        profit=prices[i]-min_Value
        if(profit>max_profit):
            max_profit=profit
        min_Value=min(prices[i],min_Value);
 return max_profit



arr=[7,1,5,3,6,4]
bestsellstock(arr)
print("Maximum profit is:", bestsellstock(arr))  # Output: 5