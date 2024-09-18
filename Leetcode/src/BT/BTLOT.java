package BT;

import java.util.ArrayList;
import java.util.List;

public class BTLOT {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(levelOrder(root));
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		
		if (root == null) return result;
		
		List<TreeNode> tree = new ArrayList<>();
		tree.add(root);
		
		while (!tree.isEmpty()) {
			List<Integer> currLevel = new ArrayList<>();
			List<TreeNode> tempTree = new ArrayList<>();
			
			for (TreeNode currNode: tree) {
				currLevel.add(currNode.val);
				
				if (currNode.left != null) {
					tempTree.add(currNode.left);
				}
				
				if (currNode.right != null) {
					tempTree.add(currNode.right);
				}
			}
			
			tree = tempTree;
			result.add(currLevel);
		}
		
		return result;
	}
}
