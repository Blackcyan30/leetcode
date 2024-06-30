from TreeNode import TreeNode
from typing import Optional
class Solution:
    def isSubTree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]):
        hello = 0

        if not subRoot:
            return True
        if not root:
            return False
        
        if self.sameTree(root, subRoot):
            return True
        
        return self.isSubTree(root.left) or self.isSubTree(root.right, subRoot)


    def sameTree(self, subTree: Optional[TreeNode], subRoot: Optional[TreeNode]):
        if not subTree and not subRoot:
            return True

        if subTree and subRoot and subTree.val == subRoot.val:
            return self.sameTree(subTree.left, subRoot.left) and self.sameTree(subTree.right, subRoot.right)
        else:
            return False