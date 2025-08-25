
class Solution {
    int cnt = 0;
    int res = -1 ;
    
     void helper(Node root, int k)
     {
      if(root == null || cnt >= k) return ;
      
      helper(root.left, k);  //  lar : root.right
      cnt ++; 
        
      if(cnt == k)
      {
         res = root.data;
         return;
      }
       helper(root.right, k);   // lar :  root.left
      } 
     
    public int kthSmallest(Node root, int k) {
        helper(root, k);
        return res;
    }
}
