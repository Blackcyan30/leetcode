from typing import List

def findDuplicate(nums: List[int]) -> int:
        
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return nums[i]

nums = [1,3,4,2,2]

print(findDuplicate(nums))