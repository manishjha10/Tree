
class Solution { 
    public boolean helper(TreeNode root , int k ,HashSet<Integer> set)
    {
        if(root == null) return false ; 
        if(set.contains(k-root.val))
        {
          return true;
        }
        set.add(root.val); 
        return helper(root.left, k, set) || helper(root.right, k, set);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        HashSet<Integer> set = new HashSet<>(); 
        return helper(root, k, set); 
    }
}
