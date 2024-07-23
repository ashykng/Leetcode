class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        L=[]
        def pot(node):
            if node is None:
                return
            L.append(node.val)
            pot(node.left)
            pot(node.right)
            return L
        return pot(root)