/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   int preOrderIndex;
    Map<Integer,Integer> res;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       preOrderIndex = 0;
        res = new HashMap<>();
        for(int i=0; i< inorder.length; i++){
            res.put(inorder[i],i);
        }
        return construct(preorder,0,preorder.length-1);
    }
    
    public TreeNode construct(int[] arr, int left, int right){
      if(left > right ){
          return null;
      }
        int a = arr[preOrderIndex];
        TreeNode result_tree = new TreeNode(a);
        preOrderIndex++;
        
        result_tree.left = construct(arr, left, res.get(a) -1);
        result_tree.right = construct(arr, res.get(a) + 1, right);
         return result_tree;
    }
   
}
