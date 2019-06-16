package RunVBScript;
import java.util.ResourceBundle;
public class FileToolVBScript07 extends FileToolVBScript{
	
	public FileToolVBScript07() {}
	
	public FileToolVBScript getinstance(int classindex) {
		if(classindex == 1) {
			return new FileToolVBScript07_01();
		}
		if(classindex == 2) {
			return new FileToolVBScript07_02();
		}
		if(classindex == 3) {
			return new FileToolVBScript07_03();
		}
		if(classindex == 4) {
			return new FileToolVBScript07_04();
		}
		return vbsmojule;
	}
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected FileToolVBScript getMojule() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	protected String getFileName(FileToolVBScript vbsmojule, String[] VBSPath) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void setOption(String _option) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}

class FileToolVBScript07_01 extends FileToolVBScript07 {
	/* 拡張子を選択し、コピーする。 */
	FileToolVBScript07_01() {}

	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath0701");
		VBSPath[1] = rb.getString("VBSFile0701");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript07_01();
	}
	@Override
	protected String getFileName(FileToolVBScript vbsmojule,String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(2).getText()+" "+text.get(3).getText()+" /e:"+text.get(0).getText()+" /sub"; 
		return filename;
	}
}
class FileToolVBScript07_02 extends FileToolVBScript07 {
	/* ファイル名を選択し、コピーする。 */
	public FileToolVBScript07_02() {}
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath0702");
		VBSPath[1] = rb.getString("VBSFile0702");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		// TODO 自動生成されたメソッド・スタブ
		return new FileToolVBScript07_02();
	}
	
	@Override
	protected String getFileName(FileToolVBScript vbsmojule,String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(2).getText()+" "+text.get(3).getText()+" /e:"+text.get(1).getText()+" /sub";
		return filename;
	}
}
 class FileToolVBScript07_03 extends FileToolVBScript07 { 
	 /* 拡張子を選択し、検索する。 */
	public FileToolVBScript07_03() {}
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath0703");
		VBSPath[1] = rb.getString("VBSFile0703");
		return VBSPath; 
	}

	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript07_03();
	}
	
	@Override
	protected String getFileName(FileToolVBScript vbsmojule,String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(2).getText()+" /e:"+text.get(0).getText()+" /sub"; 
		return filename;
	}
 }
 class FileToolVBScript07_04 extends FileToolVBScript07 {
	/* ファイル名を選択し、検索する。 */
	public FileToolVBScript07_04() {}
	
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath0704");
		VBSPath[1] = rb.getString("VBSFile0704");
		return VBSPath; 
	}
	
	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript07_04();
	}
	
	@Override
	protected String getFileName(FileToolVBScript vbsmojule,String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(2).getText()+" /e:"+text.get(1).getText()+" /sub"; 
		return filename;
	}
 }
