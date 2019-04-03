/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *思路：前序的第一个就是根节点，在中序遍历中，根节点左边的即为二叉树的左边
 *递归
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=new TreeNode(pre[0]);//确定根节点
        int len=pre.length;
        if(1==len){
            root.left=null;
            root.right=null;
           return root;
        }
        int i;
        for(i=0;i<len;i++){
            if(root.val==in[i]){
                break;
            }
        }
        if(i>0){
            int[] temp1=new int[i];
            int[] temp2=new int[i];
            for(int j=0;j<i;j++){
                temp1[j]=pre[j+1];
            }
            for(int k=0;k<i;k++){
                temp2[k]=in[k];
            }
            root.left=reConstructBinaryTree(temp1,temp2);
        }else{
            root.left=null;
        }
        if(len-i-1>0){
            int[] temp3=new int[len-i-1];
            int[] temp4=new int[len-i-1];
            for(int j=i+1;j<len;j++){
                temp3[j-i-1]=pre[j];
                temp4[j-i-1]=in[j];
            }
            root.right=reConstructBinaryTree(temp3,temp4);
        }else{
            root.right=null;
        }
       return root; 
    }
}