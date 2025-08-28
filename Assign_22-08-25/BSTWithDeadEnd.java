// TC : O(n*h) 
class Solution { 
     boolean findVal(Node root, int val) {
         if(val <= 0) return true; 
        if(root == null) return false;
        
        if(root.data == val) return true;
        else if(root.data < val) return findVal(root.right, val);  // Missing return
        else return findVal(root.left, val);  // Missing return
    } 
    
    boolean helper(Node curr , Node root)
    {
        if(curr == null) return false; 
        if(curr.left == null && curr.right == null)
        {
            int val = curr.data; 
            return findVal(root, val-1) && findVal(root, val+1); 
        }
        return helper(curr.left , root) || helper(curr.right , root); 
     }
     
    public boolean isDeadEnd(Node root){ 
     if(root == null) return false ;
     return  helper(root , root); 
    }
}


/////////////////////////// 


// class Solution {
//     public boolean checkDead(Node root , int min , int max)
//     {
//         if(root == null) return false ; 
//            // O(N)
//         if(root.left == null && root.right == null && min == max)
//         {
//             return true ; 
//         }
//         return checkDead(root.left , min , root.data-1) || checkDead(root.right, root.data+1, max); 
//     }
//     public boolean isDeadEnd(Node root) {
//        return checkDead(root , 1, Integer.MAX_VALUE); 
//     }
// }
// TC : O(N)  Better 
