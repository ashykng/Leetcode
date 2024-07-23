class Solution(object):
    def postorderTraversal(self, root):
        if not root: return []
        sol = []
        bag = [root]
        while bag:
            node = bag.pop()
            sol.append(node.val)
            if node.left:
                bag.append(node.left)
            if node.right:
                bag.append(node.right)
        return sol[::-1]