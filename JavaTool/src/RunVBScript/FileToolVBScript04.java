package RunVBScript;

import java.util.ResourceBundle;

public class FileToolVBScript04 extends FileToolVBScript{
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath04");
		VBSPath[1] = rb.getString("VBSFile04");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript04();
	}
	
	@Override
	public void setOption(String _option) {
	}

	@Override
	protected String getFileName(FileToolVBScript vbsmojule, String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(0).getText()+" /sub";
		return filename;
	}
}
