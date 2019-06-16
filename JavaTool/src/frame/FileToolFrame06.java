package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer06;

public class FileToolFrame06 extends FileToolFrame {
	private JTextField textField;
	private JTextField textField2;
	private JTextField textField3;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer06();
	private JTextArea textArea;
	/**
	 * Create the panel.
	 */
	public FileToolFrame06() {
		f.setTitle("3-06_今日作成または更新したファイルを別のフォルダにコピーする");
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
		
		textField3 = new JTextField();
		textField3.setBounds(100, 98, 227, 21);
		panel.add(textField3);
		textField3.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 130, 420, 300);
		panel.add(textArea);
		
		JLabel label = new JLabel("日数を選択：");
		label.setBounds(10, 98, 227, 21);
		panel.add(label);
		
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		btnNewButton2.setBounds(329, 63, 91, 21);
		panel.add(btnNewButton2);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame05",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame07",currentFrame);
			}
		});
		setGuiContllorer();
	}
	@Override
	protected void setGuiContllorer() {
		GuiCont.addTextList(textField);
		GuiCont.addTextList(textField2);
		GuiCont.addTextList(textField3);
		GuiCont.setRusultTextArea(textArea);
}

}
