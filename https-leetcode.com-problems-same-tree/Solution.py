class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not p and not q:
            return True
        if not p or not q or p.val != q.val:
            return False
        else:
            lSol = self.isSameTree(p.left, q.left)
            if lSol:
                return self.isSameTree(p.right, q.right)
            else:
                return False