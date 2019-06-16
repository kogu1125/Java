package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer10;

public class FileToolFrame10 extends FileToolFrame{
	private JTextField textField;
	private JTextField textField3;
	private JTextField textField4;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer10();
	private JTextArea textArea;
	/**
	 * Create the panel.
	 */
	public FileToolFrame10() {
		f.setTitle("3-10_テキストファイルの一部分を別の内容に置き換える");
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
		
		JLabel label3 = new JLabel("半角空白：/S");
		label3.setBounds(10, 168, 227, 21);
		panel.add(label3);
		
		JLabel label4 = new JLabel("全角空白：/W");
		label4.setBounds(100, 168, 227, 21);
		panel.add(label4);
		
		JLabel label5 = new JLabel("空の文字列：/NUL");
		label5.setBounds(190, 168, 227, 21);
		panel.add(label5);
		
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame09",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame11",currentFrame);
			}
		});
		setGuiContllorer();
	}
	@Override
	protected void setGuiContllorer() {
		GuiCont.addTextList(textField);
		GuiCont.addTextList(textField3);
		GuiCont.addTextList(textField4);
		GuiCont.setRusultTextArea(textArea);
	}
}
