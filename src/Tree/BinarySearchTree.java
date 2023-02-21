package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    Node root;

    BinarySearchTree(int value){

        root=new Node(value);
    }

    void insert(Node newnode,Node node) {
        if (node == null)
            node = newnode;
        else {
            if (newnode.data < node.data)
            {
                if (node.left == null)
                    node.left = newnode;
                else
                    insert(newnode, node.left);
            }
            else
            {
            if(node.right==null)
                    node.right=newnode;
                else
                    insert(newnode,node.right);

            }
        }
    }
    ArrayList arr=new ArrayList();
    void search(int value,Node node){

        if(node.data==value){
            System.out.println("value found");
            System.out.println(arr);
        }
        else{
            if(value<node.data)

            {   arr.add(node.data);
                search(value,node.left);}
            else { arr.add(node.data);
                search(value, node.right);
            }
        }
    }
    public void deletion(Node node, Node deletedNode){
       if(node==null){
           return;
       }
        if(node.left.data==deletedNode.data) {
            if (node.left.left == null && node.left.right == null) {
                node = null;
            }
        }
//            else if (node.left!=null|| node.right!=null){
//                Node node1=node.right.right;
//                node.right = node1;
//            }
        if (node.right.data==deletedNode.data){
            if (node.right.left == null && node.right.right == null) {
                node = null;
            }

        }
            deletion(node.left,deletedNode);
            deletion(node.right,deletedNode);


    }

//    Boolean checkBST(Node node){
//
//        if(node.right!=null){
//            if((node.right.data<node.data))
//                return checkBST(node.right);
//            else
//                return false;
//        }
//        else
//            return true;
//        if(node.left!=null){
//            if((node.left.data<node.data))
//                return checkBST(node.left);
//            else
//                return false;
//        }
//        else
//            return true;


  //
    //  }


    public void preOrder(Node node){
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }


    int maxDepth(Node node)
    {
        if (node == null)
            return -1;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree(45);
        tree.insert(new Node(15),tree.root);
        tree.insert(new Node(79),tree.root);
        tree.insert(new Node(90),tree.root);
        tree.insert(new Node(10),tree.root);
        tree.insert(new Node(55),tree.root);
        tree.insert(new Node(12),tree.root);
        tree.insert(new Node(20),tree.root);
        tree.insert(new Node(50),tree.root);
     //   tree.search(50, tree.root);
     //   tree.checkBST(tree.root);
     //   tree.deletion(tree.root, new Node(12));
        System.out.println(tree.maxDepth(tree.root));
        tree.preOrder(tree.root);
    }
}
//deletion checkBST height of the tree