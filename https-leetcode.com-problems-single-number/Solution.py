class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for _ in nums:
            if nums.count(_) == 1:
                return _