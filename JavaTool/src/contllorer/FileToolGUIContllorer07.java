package contllorer;
import java.util.List;

import RunVBScript.FileToolVBScript;
import RunVBScript.FileToolVBScript07;

public class FileToolGUIContllorer07 extends FileToolGUIContllorer {

	public FileToolGUIContllorer07() {
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
		FileToolVBScript07 ftvbscript = new FileToolVBScript07();
		int classindex;
		//コピーモードの場合
		if(radiobuttonlist.get(1).isSelected()) {
			//拡張子テキストに入力されている場合(拡張子検索)
			if(textlist.get(0).getText().length() != 0) {
				classindex = 1;
			}
			//拡張子テキストに何も入力されていない場合(ファイル名検索)
			else {
				classindex = 2;
			}
		}
		//検索モードの場合
		else {
			if(textlist.get(0).getText().length() != 0) {
				classindex = 3;
			}
			else {
				classindex = 4;
			}
		}
		return ftvbscript.getinstance(classindex);
	}
}