Left view
import java.util.*;


class TreeNode {  
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


public class leftview {
    static void leftView(TreeNode root,List < Integer > list,int level )
    {
        if(root==null)
            return;
        if(level==list.size())
            list.add(root.data);
        if(root.left!=null)
            leftView(root.left, list, level+1);
        if(root.right!=null)
            leftView(root.right, list, level+1);
    }


    public static void main(String args[]) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);


        List < Integer > list = new ArrayList < > ();
        leftView(root,list,0);


        System.out.println("The left view is : ");
       
            for (int nodeVal: list) {
                System.out.print(nodeVal + " ");
            }


            System.out.println();
       
    }
}
