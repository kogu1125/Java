package contllorer;

import java.util.List;

import RunVBScript.FileToolVBScript;
import RunVBScript.FileToolVBScript05;


public class FileToolGUIContllorer05 extends FileToolGUIContllorer{
	String[] optionarray = {"/t","/f","/s","/c","/u","/a","/zip"};
	@Override
	public void execvbs() {
		FileToolVBScript vbs;
		vbs = getvbsInstance();
		vbs.setTextContents(textlist);
		setOption(vbs);
		List<String> vbsresult= vbs.execVBScript();
		for(int i=0;i<vbsresult.size();i++) {
			resultTextarea.append(vbsresult.get(i)+"\n");
		}
	}

	@Override
	protected FileToolVBScript getvbsInstance() {
		return new FileToolVBScript05();
	}
	
	private void setOption(FileToolVBScript vbs) {
		for(int i = 0;i<checkBoxlist.size();i++) {
			System.out.println(checkBoxlist.get(i));
			if(checkBoxlist.get(i).isSelected()) {
				vbs.setOption(optionarray[i]);
			}
		} 
	}
}
