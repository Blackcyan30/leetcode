from collections import defaultdict
from typing import List
import heapq
def topKFrequent(nums: List[int], k: int) -> List[int]:
    freq = defaultdict(int)
    priority_queue = []
    for n in nums:
        freq[n] += 1
    
    for num, freq in freq.items():
        heapq.heappush(priority_queue, (freq, num))
        if (len(priority_queue) > k):
            heapq.heappop(priority_queue)
    
    return [item[1] for item in priority_queue]

nums = [1,2]
k = 2

print (topKFrequent(nums,k))

nums = [1,1,1,2,2,3]
k = 2

print(topKFrequent(nums, k))