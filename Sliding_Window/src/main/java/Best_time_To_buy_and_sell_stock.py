from typing import List

# This is my original solution.
def maxProfit(self, prices: List[int]) -> int:
        minPrice = prices[0]
        maxProfit = 0

        for i in range(1, len(prices)):
            if (prices[i] < minPrice):
                minPrice = prices[i]
            else:
                maxProfit = max(maxProfit, prices[i] - minPrice)
        return maxProfit

# This solution is faster.
# def maxProfit(self, prices: List[int]) -> int:
#         minPrice = prices[0]
#         maxProfit = 0

#         for i in range(1, len(prices)):
#             if (prices[i] < minPrice):
#                 minPrice = prices[i]
#             elif ((prices[i] - minPrice) > maxProfit):
#                 maxProfit = prices[i] - minPrice
#         return maxProfit

from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        strDict = defaultdict(list)
        for word in strs:
            chars = list(word)
            chars.sort()
            strDict["".join(chars)].append(word)
        return strDict.values()


testArray1 = [7,1,5,3,6,4]
testOutput1 = 5