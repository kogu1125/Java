package contllorer;

import java.util.List;

import RunVBScript.FileToolVBScript;
import RunVBScript.FileToolVBScript12;

public class FileToolGUIContllorer12 extends FileToolGUIContllorer{
	String[] optionarray = {"/sub"};
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
		return new FileToolVBScript12();
	}
	
	private void setOption(FileToolVBScript vbs) {
		for(int i = 0;i<checkBoxlist.size();i++) {
			System.out.println(checkBoxlist.get(i));
			if(checkBoxlist.get(i).isSelected()) {
				vbs.setOption(optionarray[i]);
			}
			else {
				vbs.setOption("");
			}
		} 
	}
}
