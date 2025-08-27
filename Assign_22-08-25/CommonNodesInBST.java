class Solution {
    // Function to find the nodes that are common in both BST.
    public static void helper(Node root , HashSet<Integer> set)
    {
        if(root == null) return ; 
        helper(root.left, set); 
        set.add(root.data); 
        helper(root.right, set); 
    }
     public static void checkContain(Node root,HashSet<Integer> set , ArrayList<Integer> l)
    { 
        if(root==null) return ; 
        checkContain(root.left, set, l); 
        if(set.contains(root.data)) l.add(root.data); 
        checkContain(root.right, set, l);
    }
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
       
       ArrayList<Integer>l=new ArrayList<>();
       HashSet<Integer> set = new HashSet<>(); 
       
       helper(r1 , set); 
       checkContain(r2 ,set, l); 
       return l;
    }
   
}
