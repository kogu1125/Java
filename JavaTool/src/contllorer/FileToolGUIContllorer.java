package contllorer;

import java.awt.event.WindowAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import RunVBScript.FileToolVBScript;
public abstract class FileToolGUIContllorer extends WindowAdapter{
	JTextField textfield;
	File file;
	List<JTextField> textlist = new ArrayList<JTextField>();
	List<JRadioButton> radiobuttonlist = new ArrayList<JRadioButton>();
	List<JCheckBox> checkBoxlist = new ArrayList<JCheckBox>();
	JTextArea resultTextarea;
	JFileChooser filechooser;
	public FileToolGUIContllorer() {
		
	}
	public void addTextList(JTextField _text) {
		textlist.add(_text);
	}
	
	public void addRadioButton(JRadioButton _radiobutton) {
		radiobuttonlist.add(_radiobutton);
	}
	
	public void addCheckBox(JCheckBox _checkbox) {
		checkBoxlist.add(_checkbox);
	}
	
	public void setTextEnabled(boolean isExist,JTextField textindex) {
		textindex.setEnabled(isExist);
	}
	
	public void setRusultTextArea(JTextArea _resultTextarea) {
		resultTextarea = _resultTextarea;
	}
	
	public void openDialogandSetText(JTextField _textfield) {
		setTextField(_textfield);
		setTextFilePath();
	}
	
	private void setTextField(JTextField _textfield) {
		textfield = _textfield;
	}
	
	private void setTextFilePath() {
		file = OpenDialog();
		if(file != null) {
			textfield.setText(file.getAbsolutePath());
		}
	}
	
	protected File OpenDialog() {
		filechooser = new JFileChooser("D:¥¥work");
		filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int selected = filechooser.showOpenDialog(filechooser);
	    if (selected == JFileChooser.APPROVE_OPTION){
	        file = filechooser.getSelectedFile();
	    }
	    else {
	    	file = null;
	    }
	    return file;
	}
	
	public abstract void execvbs();
	protected abstract FileToolVBScript getvbsInstance();
}
