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
 
// ������	
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

// ���̺� Ʈ����尪 ����
	public void ToLabelFromTree(JLabel label, TreeNode node){
		label.setText(node.data);
		label.setBackground(node.color);
		label.setHorizontalAlignment(node.x);
		label.setVerticalAlignment(node.y);
		label.setSize(w, h);
	}
// Ʈ����忡 ���̺� ����
	public void ToTreeFromLabel(TreeNode node, JLabel label){
		node.data = label.getText();
		node.color = label.getBackground();
		node.x = label.getHorizontalAlignment();
		node.y = label.getVerticalAlignment();
		node.w = label.getWidth();
		node.h = label.getHeight();	
	}
// ���� ���� �����ϱ�
	public void ParentConnectChild(TreeNode ParentNode, TreeNode ChildNode) {
		ParentNode.child = ChildNode;
		ChildNode.parent = ParentNode;
	}
/*
 *  �̿ϼ�
 */
	public String getData(){
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
// �ڽ��� �ڽĳ�带 ��ȯ�ϴ� �Լ�
	public TreeNode getChildSubTree(){
		return this.child;
	}
	
// ����� ��ġ(x�� y��)



}
