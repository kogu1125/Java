package RunVBScript;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FileToolVBScript13 extends FileToolVBScript{
	private Process proc;
	
	@Override
	protected String[] getVBSPath(FileToolVBScript vbsmojule) {
		String[] VBSPath = new String[2];
		ResourceBundle rb = ResourceBundle.getBundle("VBSPATH");
		VBSPath[0] = rb.getString("VBSPath13");
		VBSPath[1] = rb.getString("VBSFile13");
		return VBSPath; 
	}
	
	@Override
	protected FileToolVBScript getMojule() {
		return new FileToolVBScript13();
	}
	
	@Override
	public void setOption(String _option) {
	}

	@Override
	protected String getFileName(FileToolVBScript vbsmojule, String[] VBSPath) {
		String filename = "cmd.exe /c call cscript "+VBSPath[0]+VBSPath[1]+" "+text.get(0).getText()+" 0";
		return filename;
	}
	
	@Override
	protected Process getVBScriptProcess(String fileName) {
		System.out.println(fileName);
		proc = null;
		try {
			proc = Runtime.getRuntime().exec(fileName);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
		e.printStackTrace();
		}
		return proc;	
	}
	@Override
	protected List<String> getreadLine(Process proc) {
		String result = null;
		List<String> resulttextlist = new ArrayList<String>();
		//結果
		InputStream is = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		try {
			while((result = br.readLine()) != null){
				System.out.println(result);
				resulttextlist.add(result);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return resulttextlist;
	}
	class MultiThread extends Thread{
		@Override
		public void run() {
			String result = null;
			List<String> resulttextlist = new ArrayList<String>();
			InputStream is = proc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			try {
				while((result = br.readLine()) != null){
					System.out.println(result);
					resulttextlist.add(result);
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
