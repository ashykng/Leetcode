class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        int l = 0;
        int r = nums.length-1;

        return constructTree(root,l,r,nums);
    }
    public TreeNode constructTree(TreeNode root,int l, int r, int[] nums){
    if(l > r) return null;

    int mid = l+(r-l)/2;
    root = new TreeNode(nums[mid]);

    root.left = constructTree(root.left,l,mid-1,nums);
    root.right = constructTree(root.right,mid+1,r,nums);
    
    return root;
}
}