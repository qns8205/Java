package tree;
import java.awt.Color;
import javax.swing.*;
public class TreeNode {
	TreeNode child;
	TreeNode parent;
	int x, y, w, h;
	Color color;
	String data;
	int NumOfTab;
 
// 생성자	
	public TreeNode(JLabel label){
		child = null;
		parent = null;
		data = label.getText();
		color = label.getBackground();
		x = label.getHorizontalAlignment();
		y = label.getVerticalAlignment();
		w = label.getWidth();
		h = label.getHeight();
		label.setOpaque(true);
	}

// 레이블에 트리노드값 대입
	public void ToLabelFromTree(JLabel label, TreeNode node){
		label.setText(node.data);
		label.setBackground(node.color);
		label.setHorizontalAlignment(node.x);
		label.setVerticalAlignment(node.y);
		label.setSize(w, h);
	}
// 트리노드에 레이블값 대입
	public void ToTreeFromLabel(TreeNode node, JLabel label){
		node.data = label.getText();
		node.color = label.getBackground();
		node.x = label.getHorizontalAlignment();
		node.y = label.getVerticalAlignment();
		node.w = label.getWidth();
		node.h = label.getHeight();	
	}
// 하위 노드와 연결하기
	public void ParentConnectChild(TreeNode ParentNode, TreeNode ChildNode) {
		ParentNode.child = ChildNode;
		ChildNode.parent = ParentNode;
	}
/*
 *  미완성
 */
	public String getData(){
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
// 자신의 자식노드를 반환하는 함수
	public TreeNode getChildSubTree(){
		return this.child;
	}
	
// 노드의 위치(x와 y값)



}
