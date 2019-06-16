package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import contllorer.FileToolGUIContllorer;
import contllorer.FileToolGUIContllorer02;

public class FileToolFrame02 extends FileToolFrame {

	private JTextField textField;
	private JTextField textField2;
	FileToolGUIContllorer GuiCont = new FileToolGUIContllorer02();
	private JRadioButton rdbtnyyyymmdd;
	private JRadioButton rdbtnyyyymm;
	private JRadioButton rdbtnmmdd;
	private JRadioButton rdbtndd;
	private JRadioButton rdbtnmm;
	private JRadioButton rdbtnyyyy;
	private JRadioButton rdbtnhhmmss;
	private JRadioButton rdbtnhhmm;
	private JRadioButton rdbtnmmss;
	private JRadioButton rdbtnhh;
	private JRadioButton rdbtnmini;
	private JRadioButton rdbtnss;
	private JTextArea textArea;
	
	public FileToolFrame02() {
		f.setTitle("3-02_ファイル名に日付や時刻を加えてコピーする");
		rdbtnyyyymmdd = new JRadioButton("yyyymmdd");
		rdbtnyyyymmdd.setBounds(8, 20, 90, 21);
		panel.add(rdbtnyyyymmdd);
		
		rdbtnyyyymm = new JRadioButton("yyyymm");
		rdbtnyyyymm.setBounds(8, 55, 90, 21);
		panel.add(rdbtnyyyymm);
		
		rdbtnmmdd = new JRadioButton("mmdd");
		rdbtnmmdd.setBounds(8, 90, 90, 21);
		panel.add(rdbtnmmdd);
		
		rdbtndd = new JRadioButton("dd");
		rdbtndd.setBounds(8, 195, 90, 21);
		panel.add(rdbtndd);
		
		rdbtnmm = new JRadioButton("mm");
		rdbtnmm.setBounds(8, 160, 90, 21);
		panel.add(rdbtnmm);
		
		rdbtnyyyy = new JRadioButton("yyyy");
		rdbtnyyyy.setBounds(8, 125, 90, 21);
		panel.add(rdbtnyyyy);
		
		rdbtnhhmmss = new JRadioButton("hhmmss");
		rdbtnhhmmss.setBounds(8, 230, 90, 21);
		panel.add(rdbtnhhmmss);
		
		rdbtnhhmm = new JRadioButton("hhmm");
		rdbtnhhmm.setBounds(8, 265, 90, 21);
		panel.add(rdbtnhhmm);
		
		rdbtnmmss = new JRadioButton("mmss");
		rdbtnmmss.setBounds(8, 300, 90, 21);
		panel.add(rdbtnmmss);
		
		rdbtnhh = new JRadioButton("hh");
		rdbtnhh.setBounds(8, 335, 90, 21);
		panel.add(rdbtnhh);
		
		rdbtnmini = new JRadioButton("mini");
		rdbtnmini.setBounds(8, 370, 90, 21);
		panel.add(rdbtnmini);
		
		rdbtnss = new JRadioButton("ss");
		rdbtnss.setBounds(8, 405, 90, 21);
		panel.add(rdbtnss);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnyyyymmdd);
		group.add(rdbtnyyyymm);
		group.add(rdbtnmmdd);
		group.add(rdbtndd);
		group.add(rdbtnmm);
		group.add(rdbtnyyyy);
		group.add(rdbtnhhmmss);
		group.add(rdbtnhhmm);
		group.add(rdbtnmmss);
		group.add(rdbtnhh);
		group.add(rdbtnmini);
		group.add(rdbtnss);
		
		textField = new JTextField();
		textField.setBounds(100, 28, 227, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(100, 63, 227, 21);
		panel.add(textField2);
		textField2.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(100, 130, 330, 300);
		panel.add(textArea);
		
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
		btnNewButton.setBounds(329, 28, 91, 21);
		panel.add(btnNewButton);
		btnNewButton3.setBounds(329, 98, 91, 21);
		panel.add(btnNewButton3);
		btnNewButton2.setBounds(329, 63, 91, 21);
		panel.add(btnNewButton2);
		Maebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame01",currentFrame);
			}
		});
		Tugibutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame03",currentFrame);
			}
		});
		setGuiContllorer();
	}

	@Override
	protected void setGuiContllorer() {
			GuiCont.addTextList(textField);
			GuiCont.addTextList(textField2);
			GuiCont.addRadioButton(rdbtnyyyymmdd);
			GuiCont.addRadioButton(rdbtnyyyymm);
			GuiCont.addRadioButton(rdbtnmmdd);
			GuiCont.addRadioButton(rdbtnyyyy);
			GuiCont.addRadioButton(rdbtnmm);
			GuiCont.addRadioButton(rdbtndd);
			GuiCont.addRadioButton(rdbtnhhmmss);
			GuiCont.addRadioButton(rdbtnhhmm);
			GuiCont.addRadioButton(rdbtnmmss);
			GuiCont.addRadioButton(rdbtnhh);
			GuiCont.addRadioButton(rdbtnmini);
			GuiCont.addRadioButton(rdbtnss);
			GuiCont.setRusultTextArea(textArea);
	}
}
