package contllorer;

import java.util.List;

import RunVBScript.FileToolVBScript;
import RunVBScript.FileToolVBScript01;

public class FileToolGUIContllorer01 extends FileToolGUIContllorer{
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
		return new FileToolVBScript01();
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
