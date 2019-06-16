package RunVBScript;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FileToolVBScript05 extends FileToolVBScript{
	List<String> optionList = new ArrayList<String>();
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath05");
		VBSPath[1] = rb.getString("VBSFile05");
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
		String stroption = "";
		for(int i=0;i<optionList.size();i++) {
			stroption = stroption + " "+optionList.get(i);
		}
		System.out.println(stroption);
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(0).getText()+stroption+" /sub";
		return filename;
	}
}
