package contllorer;

import java.util.List;

import RunVBScript.FileToolVBScript;
import RunVBScript.FileToolVBScript06;

public class FileToolGUIContllorer06 extends FileToolGUIContllorer{

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
		return new FileToolVBScript06();
	}
}
