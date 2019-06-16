package RunVBScript;

import java.util.ResourceBundle;

public class FileToolVBScript08 extends FileToolVBScript {
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath08");
		VBSPath[1] = rb.getString("VBSFile08");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript08();
	}
	
	@Override
	public void setOption(String _option) {
	}

	@Override
	protected String getFileName(FileToolVBScript vbsmojule, String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(0).getText()+" /c:"+text.get(1).getText();
		return filename;
	}
}
