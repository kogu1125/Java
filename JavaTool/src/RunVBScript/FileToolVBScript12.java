package RunVBScript;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FileToolVBScript12 extends FileToolVBScript{
	List<String> optionList = new ArrayList<String>();
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath12");
		VBSPath[1] = rb.getString("VBSFile12");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript05();
	}
	
	@Override
	public void setOption(String _option) {
		optionList.add(_option);
	}

	@Override
	protected String getFileName(FileToolVBScript vbsmojule, String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(0).getText()+" "+text.get(1).getText()+" "+text.get(2).getText()+" "+optionList.get(0);
		return filename;
	}
}
