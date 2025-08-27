
class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public void helper(Node root , ArrayList<Integer> l)
    {
        if(root == null) return ;
        helper(root.left, l); 
        l.add(root.data); 
        helper(root.right, l); 
    }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> l = new ArrayList<>();
        helper(root1, l); 
        helper(root2, l); 
        Collections.sort(l);  // n(logn)
        return l ;
    }
}
