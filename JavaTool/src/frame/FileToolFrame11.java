package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer11;

public class FileToolFrame11 extends FileToolFrame{
	private JTextField textField;
	private JTextField textField2;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer11();
	private JTextArea textArea;
	/**
	 * Create the panel.
	 */
	public FileToolFrame11() {
		f.setTitle("3-11_フラットファイルのレイアウトを変更する");
		JButton btnNewButton = new JButton("選択");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.openDialogandSetText(textField);
			}
		});
		JButton btnNewButton2 = new JButton("選択");
		btnNewButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.openDialogandSetText(textField2);
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
		
		textField2 = new JTextField();
		textField2.setBounds(10, 63, 317, 21);
		panel.add(textField2);
		textField2.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 130, 420, 300);
		panel.add(textArea);
		
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		btnNewButton2.setBounds(329, 63, 91, 21);
		panel.add(btnNewButton2);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame10",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame12",currentFrame);
			}
		});
		setGuiContllorer();
	}
	@Override
	protected void setGuiContllorer() {
		GuiCont.addTextList(textField);
		GuiCont.addTextList(textField2);
		GuiCont.setRusultTextArea(textArea);
	}
}
