Top view 
import java.util.*;


class TreeNode {
    int data;
    TreeNode left= null, right= null;
    TreeNode(int data) {
        this.data = data;
    }
}


class Pair{
    TreeNode node;
    int hd;
    Pair(TreeNode node, int hd){
        this.node=node;
        this.hd=hd;
    }
}


public class topview {
    static ArrayList<Integer> topView(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            TreeNode temp = it.node;


            if(!map.containsKey(hd)) map.put(hd, temp.data);


            if(temp.left != null) {
                q.add(new Pair(temp.left, hd - 1));
            }
            if(temp.right != null)
                q.add(new Pair(temp.right, hd + 1));
        }
   
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
            ans.add(entry.getValue());
        return ans;
    }


    public static void main(String args[]) {


        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.left.right.right.right = new TreeNode(4);
        root.left.right.right.right.right = new TreeNode(5);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);


        List < Integer > list = new ArrayList < > ();
        list = topView(root);


        System.out.println("The top view is : ");
       
            for (int nodeVal: list)
                System.out.print(nodeVal + " ");


            System.out.println();
    }  
}
