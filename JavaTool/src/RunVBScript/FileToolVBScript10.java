package RunVBScript;

import java.util.ResourceBundle;

public class FileToolVBScript10 extends FileToolVBScript{
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath10");
		VBSPath[1] = rb.getString("VBSFile10");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript10();
	}
	
	@Override
	public void setOption(String _option) {
	}

	@Override
	protected String getFileName(FileToolVBScript vbsmojule, String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(0).getText()+" "+text.get(1).getText()+" "+text.get(2).getText();
		return filename;
	}
}
