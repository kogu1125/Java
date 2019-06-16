package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer08;

public class FileToolFrame08 extends FileToolFrame {

	private JTextField textField;
	private JTextField textField2;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer08();
	private JTextArea textArea;
	/**
	 * Create the panel.
	 */
	public FileToolFrame08() {
		f.setTitle("3-08_ファイルを任意の個数に分割する");
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
		
		textField2 = new JTextField();
		textField2.setBounds(80, 63, 227, 21);
		panel.add(textField2);
		textField2.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 130, 420, 300);
		panel.add(textArea);
		
		JLabel label = new JLabel("分割個数：");
		label.setBounds(10, 63, 227, 21);
		panel.add(label);
		
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame07",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame09",currentFrame);
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
