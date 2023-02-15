from typing import List


def twosum(nums: List[int], target: int) -> List[int]:
    result_array = []
    for i in range(len(nums)):
        for j in range(1,len(nums)):
            if (nums[i] + nums[j]) == target and i != j:
                result_array.append(i)
                result_array.append(j)
                return result_array


class Solution:
    nums = [3,2,3]
    target = 6
    print(twosum(nums,target))

