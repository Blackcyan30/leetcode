# Link to problem https://leetcode.com/problems/search-a-2d-matrix/submissions/1275436074/

from typing import List
def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

    low, high = 0, len(matrix) - 1

    while (low <= high):
        mid = (low + high) // 2
        
        if target in matrix[mid]:
            return True 

        if (matrix[mid][0] < target):
            low += 1
        else:
            high -= 1
    return False

            

        