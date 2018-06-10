import tree.TreeNode;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.event.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setTitle("SImple Mind Mapping Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 600);
		
		// ƒ‹≈Ÿ∆Æ ∆‰¿Œ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// ∏∂¿ŒµÂ∏  ∆‰¿Œ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
		JScrollPane scrollPane_2 = new JScrollPane();
		contentPane.add(scrollPane_2, BorderLayout.CENTER);
						
		JPanel MindMapPane = new JPanel();
		MindMapPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		MindMapPane.setBackground(Color.WHITE);
		scrollPane_2.setViewportView(MindMapPane);
				
		//≈ÿΩ∫∆Æ ø°æÓ∏ÆæÓ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane, BorderLayout.WEST);
				
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
				
		JTextArea textArea = new JTextArea();
		textArea.setTabSize(3);
		scrollPane.setViewportView(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);

		JButton TAbutton = new JButton("¿˚øÎ");
		TAbutton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		TAbutton.setPreferredSize(new Dimension(200, 5));
		TAbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TAnode = textArea.getText();
				String[] aLine = TAnode.split("\n");
				TreeNode[] TREE = new TreeNode[aLine.length];
				JLabel[] MindMapNode = new JLabel[aLine.length];
				for(int i = 0; i < aLine.length; i++) {
					MindMapNode[i] = new JLabel(aLine[i]);
					TREE[i] = new TreeNode(MindMapNode[i]);
					MindMapPane.add(MindMapNode[i]);					
				}
				MindMapPane.revalidate();
				MindMapPane.repaint();
			}
		});
		
		splitPane.setRightComponent(TAbutton);
		splitPane.setDividerLocation(450);
				
		// ∏ﬁ¥∫  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\uD30C\uC77C");
		mnNewMenu.setFont(new Font("HY∞ﬂ∞ÌµÒ", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_2 = new JMenuItem("\uC0C8\uB85C\uB9CC\uB4E4\uAE30");
		mnNewMenu.add(menuItem_2);
		
		JMenuItem menuItem = new JMenuItem("≈ÿΩ∫∆Æ∆ƒ¿œ∑Œ ø≠±‚");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				TextFileOpener tfo=new TextFileOpener();
				
				try {
					tfo.Pickfile();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				textArea.setText(tfo.sb.toString());
			}
		});

		mnNewMenu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\uC800\uC7A5");
		mnNewMenu.add(menuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\uB2E4\uB978 \uC774\uB984\uC73C\uB85C \uC800\uC7A5");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uB2EB\uAE30");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmNewMenuItem_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem menuItem_3 = new JMenuItem("\uC801\uC6A9");
		mnNewMenu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\uBCC0\uACBD");
		mnNewMenu.add(menuItem_4);

		// ≈¯πŸ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton_0 = new JButton("ªı∑Œ ∏∏µÈ±‚");
		btnNewButton_0.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 14));
		toolBar.add(btnNewButton_0);
		
		JButton btnNewButton = new JButton("≈ÿΩ∫∆Æ∆ƒ¿œ∑Œ ø≠±‚");
		btnNewButton.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				TextFileOpener tfo=new TextFileOpener();
				
				try {
					tfo.Pickfile();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				textArea.setText(tfo.sb.toString());
			}

		});
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("¿˙¿Â");
		btnNewButton_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 14));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("¥Ÿ∏• ¿Ã∏ß¿∏∑Œ ¿˙¿Â");
		btnNewButton_2.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 14));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("¿˚øÎ");
		btnNewButton_7.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 14));
		toolBar.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("∫Ø∞Ê");
		btnNewButton_8.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 14));
		toolBar.add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("¥›±‚");
		btnNewButton_6.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 14));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		toolBar.add(btnNewButton_6);

		// º”º∫∆‰¿Œ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_1, BorderLayout.EAST);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		splitPane_1.setLeftComponent(scrollPane_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[70px][grow]", "[39px][][]"));
		
		JLabel lblText = new JLabel("TEXT :");
		lblText.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
		panel.add(lblText, "cell 0 0,alignx right,growy");
		
		textField = new JTextField();
		textField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		textField.setText("");
		panel.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblX = new JLabel("X :");
		lblX.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
		panel.add(lblX, "cell 0 1,alignx trailing");
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		panel.add(textField_1, "cell 1 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblY = new JLabel("Y :");
		lblY.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
		panel.add(lblY, "cell 0 2,alignx trailing");
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		panel.add(textField_2, "cell 1 2,growx");
		textField_2.setColumns(10);
		splitPane_1.setDividerLocation(450);
		
		JLabel lblW = new JLabel("W :");
		lblW.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
		panel.add(lblW, "cell 0 3,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		panel.add(textField_3, "cell 1 3,growx");
		textField_3.setColumns(10);
		splitPane_1.setDividerLocation(450);
		
		JLabel lblH = new JLabel("H :");
		lblH.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
		panel.add(lblH, "cell 0 4,alignx trailing");
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		panel.add(textField_4, "cell 1 4,growx");
		textField_4.setColumns(10);
		splitPane_1.setDividerLocation(450);
		
		JLabel lblCOLOR = new JLabel("COLOR :");
		lblCOLOR.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 20));
		panel.add(lblCOLOR, "cell 0 5,alignx trailing");
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		panel.add(textField_5, "cell 1 5,growx");
		textField_5.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\uC801\uC6A9");
		btnNewButton_3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 18));
		btnNewButton_3.setPreferredSize(new Dimension(200, 5));
		splitPane_1.setRightComponent(btnNewButton_3);
		splitPane_1.setDividerLocation(450);

		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{toolBar, TAbutton, btnNewButton_0, btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_7, btnNewButton_8, btnNewButton_6, splitPane, scrollPane, textArea, splitPane_1, scrollPane_1, panel, lblText, textField, lblX, textField_1, lblY, textField_2, lblW, textField_3, lblH, textField_4, lblCOLOR, textField_5, btnNewButton_3, scrollPane_2, MindMapPane})); 
	}
}
