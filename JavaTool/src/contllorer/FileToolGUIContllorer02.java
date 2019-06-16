package contllorer;

import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;

import RunVBScript.FileToolVBScript;
import RunVBScript.FileToolVBScript02;

public class FileToolGUIContllorer02 extends FileToolGUIContllorer{
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
		setOption(vbs);
		vbs.setTextContents(textlist);
		List<String> vbsresult= vbs.execVBScript();
		for(int i=0;i<vbsresult.size();i++) {
			resultTextarea.append(vbsresult.get(i)+"\n");
		}
		
	}

	@Override
	protected FileToolVBScript getvbsInstance() {
		return new FileToolVBScript02();
	}
	
	private void setOption(FileToolVBScript vbs) {
		for(int i = 1;i<radiobuttonlist.size() + 1;i++) {
			if(radiobuttonlist.get(i-1).isSelected()) {
				if(i<7) {
					vbs.setOption("/d"+i);
				}
				else {
					vbs.setOption("/t"+(i-6));
				}
			}
		} 
	}
}
