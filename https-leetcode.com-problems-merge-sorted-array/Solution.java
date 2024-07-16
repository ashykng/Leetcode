import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        Do not return anything, modify nums1 in-place instead.
        */
        
        int indexNums2 = 0;
        while (m < nums1.length)
            nums1[m++] = nums2[indexNums2++];
        Arrays.sort(nums1);
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        sol.merge(nums1, m, nums2, n);
        
        System.out.println(Arrays.toString(nums1));
    }
}
