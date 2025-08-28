
class Solution {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST 
    
    public void helper(Node root , ArrayList<Integer> l)
    {
        if(root == null) return ; 
        helper(root.left, l); 
        l.add(root.data); 
        helper(root.right, l);
    } 
    Node helper1( ArrayList<Integer>  l , int lo , int hi)
    {
        if(lo > hi) return null ; 
        
        int mid = (lo + hi)/2; 
        Node root = new Node(l.get(mid)); 
        root.left =  helper1(l, lo, mid-1); 
        root.right = helper1(l , mid+1, hi); 
        
        return root; 
    }
    Node binaryTreeToBST(Node root) {
      ArrayList<Integer>  l = new ArrayList<>(); 
      helper(root , l); 
      Collections.sort(l); 
      
      return helper1(l, 0 , l.size()-1); 
      
       
        
    }
}
