
class Solution {
    int helper(Node root , int l , int h)
    {
        if(root == null) return 0; 
        
        // s1 : in inclusive range
        if(root.data >= l && root.data <= h)  
        {
            return 1 + helper(root.left , l , h) + helper(root.right, l, h);
        }
        else if(root.data > l)   
        {
            return helper(root.left , l , h); 
        }
        else 
        {
            return helper(root.right , l , h); 
        }
    }
    int getCount(Node root, int l, int h) {
        return helper(root, l , h); 
    }
}
