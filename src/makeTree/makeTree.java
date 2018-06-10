package makeTree;
import tree.TreeNode;
public class makeTree{
	private TreeNode root;
	public makeTree() {
		root = null;
	}
	public void SetRoot(String data) {
		root = new TreeNode(data);
	}
	public void changeNodeData(TreeNode node, String data) {
		node.setData(data);
	}

	public void insert(String data) {
		root = insert(root, data);
	}
	private TreeNode insert(TreeNode node, String data) {
		if (node == null)
			node = new TreeNode(data);
		else {
			node.child = insert(node.child, data);
		}
		return node;
	}

}
