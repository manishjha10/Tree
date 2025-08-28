
class Solution { 
    public static void helper(Node root , ArrayList<Integer> l)
    {
        if(root == null) return;
        
        helper(root.left , l); 
        l.add(root.data); 
        helper(root.right, l); 
    }
    public static void helper1(Node root , Set<Integer> s)
    {
        if(root == null) return;
        
        helper1(root.left , s); 
        s.add(root.data); 
        helper1(root.right, s); 
    }
    public static int countPairs(Node root1, Node root2, int x) {
        if(root1 == null || root2 == null) return 0; 
        ArrayList<Integer> l1 = new ArrayList<>(); 
        Set<Integer> s = new HashSet<>(); 
         
        helper(root1, l1); 
        helper1(root2, s); 
        
        int count = 0; 
        for(int ele :l1)
        {
            if(s.contains(x-ele))
            {
                count +=1;
            }
        }
        return count ;
        
    }
} 
