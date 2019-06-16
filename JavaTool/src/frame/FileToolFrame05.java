package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer05;

public class FileToolFrame05 extends FileToolFrame {
	private JTextArea textArea;
	private JTextField textField;
	JCheckBox chckbxNewCheck;
	JCheckBox checkBox;
	JCheckBox checkBox_1;
	JCheckBox checkBox_2;
	JCheckBox checkBox_3;
	JCheckBox checkBox_4;
	JCheckBox chckbxZip;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer05();
	/**
	 * Create the panel.
	 */
	public FileToolFrame05() {
		f.setTitle("3-05_指定したフォルダに保存されているファイル一覧を表示する");
		f.setSize(1000, 1000);
		panel.setBounds(0, 0, 1000, 1000);
		setLayout(null);
		
		chckbxNewCheck = new JCheckBox("見出し行を表示");
		chckbxNewCheck.setBounds(0, 6, 130, 21);
		panel.add(chckbxNewCheck);
		
		checkBox = new JCheckBox("ファイル名だけ表示");
		checkBox.setBounds(0, 29, 150, 21);
		panel.add(checkBox);
		
		checkBox_1 = new JCheckBox("ファイルサイズを表示");
		checkBox_1.setBounds(0, 52, 180, 21);
		panel.add(checkBox_1);
		
		checkBox_2 = new JCheckBox("ファイルの作成日");
		checkBox_2.setBounds(0, 75, 140, 21);
		panel.add(checkBox_2);
		
		checkBox_3 = new JCheckBox("ファイルの更新日");
		checkBox_3.setBounds(0, 98, 140, 21);
		panel.add(checkBox_3);
		
		checkBox_4 = new JCheckBox("最終アクセス日");
		checkBox_4.setBounds(0, 121, 130, 21);
		panel.add(checkBox_4);
		
		chckbxZip = new JCheckBox("zip書庫ファイル");
		chckbxZip.setBounds(0, 144, 130, 21);
		panel.add(chckbxZip);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 180, 950, 750);
		panel.add(textArea);
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    scrollPane.setBounds(10,180,950,750);
	    panel.add(scrollPane);
		textField = new JTextField();
		textField.setBounds(200, 28, 650, 21);
		panel.add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("選択");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.openDialogandSetText(textField);
			}
		});
		JButton btnNewButton3 = new JButton("実行");
		btnNewButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.execvbs();
			}
		});
		btnNewButton.setBounds(850, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(500, 98, 91, 51);
		panel.add(btnNewButton3);
		Topbutton.setBounds(680, 935, 105, 21);
		Maebutton.setBounds(800, 935, 62, 21);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame04",currentFrame);
			}
		});
		Tugibutton.setBounds(877, 935, 62, 21);
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame06",currentFrame);
			}
		});
		setGuiContllorer();
	}
	@Override
	protected void setGuiContllorer() {
		GuiCont.addTextList(textField);
		GuiCont.setRusultTextArea(textArea);
		GuiCont.addCheckBox(chckbxNewCheck);
		GuiCont.addCheckBox(checkBox);
		GuiCont.addCheckBox(checkBox_1);
		GuiCont.addCheckBox(checkBox_2);
		GuiCont.addCheckBox(checkBox_3);
		GuiCont.addCheckBox(checkBox_4);
		GuiCont.addCheckBox(chckbxZip);
	}
}
