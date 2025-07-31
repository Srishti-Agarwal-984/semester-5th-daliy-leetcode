# Last updated: 7/31/2025, 5:36:50 PM
from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # Initialize variables to track the minimum price and maximum profit
        min_price = float('inf')
        max_profit = 0
        
        # Iterate through each price
        for price in prices:
            # Update the minimum price if the current price is lower
            if price < min_price:
                min_price = price
            # Calculate the profit by subtracting the minimum price from the current price
            profit = price - min_price
            # Update the maximum profit if the calculated profit is higher
            if profit > max_profit:
                max_profit = profit
        
        return max_profit
