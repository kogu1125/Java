package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer13;

public class FileToolFrame13 extends FileToolFrame{
	private JTextField textField;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer13();
	private JTextArea textArea;
	/**
	 * Create the panel.
	 */
	public FileToolFrame13() {
		f.setTitle("3-13‗ファイルへ追加された部分を表示する_tailコマンド");
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
		
		textArea = new JTextArea();
		textArea.setBounds(10, 130, 420, 310);
		panel.add(textArea);
		
		
		
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame12",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame01",currentFrame);
			}
		});
		setGuiContllorer();
	}
	@Override
	protected void setGuiContllorer() {
		GuiCont.addTextList(textField);
		GuiCont.setRusultTextArea(textArea);
	}
}
