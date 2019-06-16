package contllorer;

import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;

import RunVBScript.FileToolVBScript;
import RunVBScript.FileToolVBScript09;

public class FileToolGUIContllorer09 extends FileToolGUIContllorer {
	
	@Override
	protected File OpenDialog() {
		filechooser = new JFileChooser("D:¥¥work");
		filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int selected = filechooser.showOpenDialog(filechooser);
	    if (selected == JFileChooser.APPROVE_OPTION){
	        file = filechooser.getSelectedFile();
	    }
	    else {
	    	file = null;
	    }
	    return file;
		
	}
	@Override
	public void execvbs() {
		FileToolVBScript vbs;
		vbs = getvbsInstance();
		vbs.setTextContents(textlist);
		List<String> vbsresult= vbs.execVBScript();
		for(int i=0;i<vbsresult.size();i++) {
			resultTextarea.append(vbsresult.get(i)+"\n");
		}
		
	}

	@Override
	protected FileToolVBScript getvbsInstance() {
		return new FileToolVBScript09();
	}
}
