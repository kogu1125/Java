package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer03;

public class FileToolFrame03 extends FileToolFrame {
	private JTextArea textArea;
	private JTextField textField;
	private JTextField textField2;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer03();
	
	public FileToolFrame03() {
		f.setTitle("3-03_作成日から一定期間が経過したファイルを削除する");
		textArea = new JTextArea();
		textArea.setBounds(10, 130, 420, 300);
		panel.add(textArea);
		textField = new JTextField();
		textField.setBounds(10, 28, 317, 21);
		panel.add(textField);
		textField.setColumns(10);
		JLabel label = new JLabel("日数を選択：");
		label.setBounds(10, 63, 227, 21);
		panel.add(label);
		textField2 = new JTextField();
		textField2.setBounds(100, 63, 227, 21);
		panel.add(textField2);
		textField2.setColumns(10);
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
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame02",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame04",currentFrame);
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
