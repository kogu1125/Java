package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer07;

public class FileToolFrame07 extends FileToolFrame {
	private JTextField Kind_textField;
	private JTextField Kensakumei_textField;
	private JTextField Kensaku_textField;
	private JTextField Copy_textField;
	private JTextArea textArea;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer07();
	/**
	 * Create the panel.
	 */
	public FileToolFrame07() {
		f.setTitle("3-07_条件に合うファイルを選択し、別フォルダにコピーする");
		JButton btnNewButton = new JButton("検索元選択");
		btnNewButton.setBounds(234, 60, 115, 21);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.openDialogandSetText(Kensaku_textField);
			}
		});
		setLayout(null);
		
		Kensakumei_textField = new JTextField();
		Kensakumei_textField.setBounds(221, 32, 202, 19);
		panel.add(Kensakumei_textField);
		Kensakumei_textField.setColumns(10);
		
		Kind_textField = new JTextField();
		Kind_textField.setBounds(70, 32, 96, 19);
		panel.add(Kind_textField);
		Kind_textField.setColumns(10);
		
		Kensaku_textField = new JTextField();
		Kensaku_textField.setBounds(4, 61, 228, 19);
		panel.add(Kensaku_textField);
		Kensaku_textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("実行");
		btnNewButton_2.setBounds(352, 60, 71, 60);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.execvbs();
			}
		});
		
		JButton btnNewButton_1 = new JButton("コピー先選択");
		btnNewButton_1.setBounds(234, 91, 115, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.openDialogandSetText(Copy_textField);
			}
		});
		panel.add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("拡張子：");
		label_4.setBounds(22, 35, 53, 13);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("検索名：");
		label_5.setBounds(176, 35, 53, 13);
		panel.add(label_5);
		
		Copy_textField = new JTextField();
		Copy_textField.setBounds(4, 90, 228, 19);
		Copy_textField.setColumns(10);
		panel.add(Copy_textField);
		
		radioButton = new JRadioButton("検索モード");
		radioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.setTextEnabled(false, Copy_textField);
			}
		});
		radioButton.setBounds(128, 5, 100, 21);
		panel.add(radioButton);
		
		radioButton_1 = new JRadioButton("コピーモード");
		radioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiCont.setTextEnabled(true, Copy_textField);
			}
		});
		radioButton_1.setBounds(23, 5, 110, 21);
		panel.add(radioButton_1);
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton);
		group.add(radioButton_1);
		
		textArea = new JTextArea();
		panel.add(textArea);
		textArea.setBounds(4, 131, 419, 298);
		setGuiContllorer();
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    scrollPane.setBounds(4,128,420,300);
	    panel.add(scrollPane);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame06",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame08",currentFrame);
			}
		});
	}
	
	@Override
	protected void setGuiContllorer() {
		GuiCont.addTextList(Kind_textField);
		GuiCont.addTextList(Kensakumei_textField);
		GuiCont.addTextList(Kensaku_textField);
		GuiCont.addTextList(Copy_textField);
		GuiCont.setRusultTextArea(textArea);
		GuiCont.addRadioButton(radioButton);
		GuiCont.addRadioButton(radioButton_1);
	}
}
