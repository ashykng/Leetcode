class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        index_nums2 = 0
        while m < len(nums1):
            nums1[m] = nums2[index_nums2]
            m += 1
            index_nums2 += 1

        nums1.sort()