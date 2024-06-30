from collections import defaultdict
from typing import List

# This is my initial solution that I came up with. 
# My solution is better as it is faster it's time complexity if O(n.log(m))
def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groupAnagram = {}

        for word in strs:
            sorted_word = "".join(sorted(word))
            if (sorted_word in groupAnagram):
                groupAnagram[sorted_word].append(word)
            else:
                groupAnagram[sorted_word] = [word]
        
        return groupAnagram.values()

# This is the solution by neet code
# This is a slower solution it's time complexity is O(n.m)
def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            res[tuple(count)].append(s)
        return res.values()
