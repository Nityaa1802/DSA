import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    int sum =0;
    List<TreeNode> leafNodes=new ArrayList<>();
    public boolean hasPathSum(TreeNode root, int targetSum) {
        leafNode(root);
        for(TreeNode node:leafNodes)
        {
            int sum=0;
            ancestors(root,node);
            if(sum==targetSum)
                return true;
        }
        return false;
    }
    public boolean ancestors(TreeNode root,TreeNode node){

        if(root==null)
            return false;
        if(root.equals(node)){
            sum+=root.val;
            return true;
        }
        if(ancestors(root.left,node)||ancestors(root.right,node))
        {
            sum+=root.val;
            return true;}
        return false;
    }
    public List<TreeNode> leafNode(TreeNode root){
        if(root==null)
            return leafNodes;
        if(root.left==null && root.right==null)
            leafNodes.add(root);
        leafNode(root.left);
        leafNode(root.right);
        return leafNodes;
    }
}