
class Solution { //O*N)
    public TreeNode findPredecessor(TreeNode node)
    {
        while(node.right !=null)
        {
            node = node.right;
        }
        return node ;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
        {
            return root; 
        }
        if(key < root.val)
        {
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val)
        {
            root.right = deleteNode(root.right, key);
        }
        else
        { 
            // root.val == key 
            // leaf node 
            if(root.left == null && root.right == null)
            {
                return null; 
            }
            //single child 
            if(root.left == null)
            {
                return root.right;
            }
            if(root.right == null)
            {
                return root.left ;
            }else{
                // 2nd child case 
                // inorder precedecssor
                TreeNode node = findPredecessor(root.left); 
                // shift the node 
                root.val = node.val;
                // delete node.val 
                root.left = deleteNode(root.left ,node.val); 
            }

        }
        return root; 

     
    
    }
}
