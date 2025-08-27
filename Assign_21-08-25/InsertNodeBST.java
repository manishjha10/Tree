class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
        {
            return new TreeNode(val); // correct placr  we insert the val 
        }

        if(val <  root.val)
        {
            root.left = insertIntoBST(root.left , val); 
        }
        else if(val > root.val)
        {
            root.right = insertIntoBST(root.right , val); 
        }
        return root ;
    }
}
