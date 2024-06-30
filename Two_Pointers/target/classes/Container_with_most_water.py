
from typing import List


def maxArea(height: List[int]) -> int:
    left, right = 0, len(height) - 1
    volume = []
    length = len(height) - 1
    while (left <= right):
        min_height_at_instance = min(height[left], height[right])
        volume.append(min_height_at_instance * length)
        length -= 1
        if (height[left] < height[right]):
            left += 1
        else:
            right -= 1

    return max(volume)

heights = [1,8,6,2,5,4,8,3,7]

res = maxArea(heights)
print(res)

heights = [1,1]
print(maxArea(heights))