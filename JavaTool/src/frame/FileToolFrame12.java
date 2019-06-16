package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer12;

public class FileToolFrame12 extends FileToolFrame {
	private JTextField textField;
	private JTextField textField3;
	private JTextField textField4;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer12();
	private JTextArea textArea;
	JCheckBox chckbxNewCheck;
	/**
	 * Create the panel.
	 */
	public FileToolFrame12() {
		f.setTitle("3-12_ファイル名を一括リネームする");
		
		chckbxNewCheck = new JCheckBox("サブフォルダ");
		chckbxNewCheck.setBounds(0, 63, 130, 21);
		panel.add(chckbxNewCheck);
		
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
		textField = new JTextField();
		textField.setBounds(10, 28, 317, 21);
		panel.add(textField);
		textField.setColumns(10);

		
		textField3 = new JTextField();
		textField3.setBounds(70, 98, 227, 21);
		panel.add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(70, 133, 227, 21);
		panel.add(textField4);
		textField4.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 190, 420, 240);
		panel.add(textArea);
		
		JLabel label = new JLabel("置換前：");
		label.setBounds(10, 98, 227, 21);
		panel.add(label);
		
		JLabel label2 = new JLabel("置換後：");
		label2.setBounds(10, 133, 227, 21);
		panel.add(label2);
		
		JLabel label3 = new JLabel("値なし：/null");
		label3.setBounds(10, 168, 227, 21);
		panel.add(label3);
		
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame11",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame13",currentFrame);
			}
		});
		setGuiContllorer();
	}
	@Override
	protected void setGuiContllorer() {
		GuiCont.addTextList(textField);
		GuiCont.addTextList(textField3);
		GuiCont.addTextList(textField4);
		GuiCont.addCheckBox(chckbxNewCheck);
		GuiCont.setRusultTextArea(textArea);
	}
}
