package RunVBScript;

import java.util.ResourceBundle;

public class FileToolVBScript01 extends FileToolVBScript {
	private String option;
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath01");
		VBSPath[1] = rb.getString("VBSFile01");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript01();
	}
	
	public void setOption(String _option) {
		option=_option;
	}

	@Override
	protected String getFileName(FileToolVBScript vbsmojule, String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(0).getText()+" "+option;
		return filename;
	}
}
