package RunVBScript;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

public abstract class FileToolVBScript {
	protected List<JTextField> text;
	protected abstract String[] getVBSPath(FileToolVBScript vbsmojule);
	protected abstract FileToolVBScript getMojule();
	protected abstract String getFileName(FileToolVBScript vbsmojule,String[] VBSPath);
	protected FileToolVBScript vbsmojule;
	public abstract void setOption(String _option);
	public void setTextContents(List<JTextField> _text) {
		text = _text;
	}		
	public List<String> execVBScript(){
		vbsmojule = getMojule();
		String[] VBSPath = getVBSPath(vbsmojule);
		String fileName = getFileName(vbsmojule,VBSPath);
		Process proc = getVBScriptProcess(fileName);
		List<String> resulttext = null;
		resulttext = getreadLine(proc);
		return resulttext;
	}
			
	protected Process getVBScriptProcess(String fileName) {
		System.out.println(fileName);
		Process proc = null;
		try {
			proc = Runtime.getRuntime().exec(fileName);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
		e.printStackTrace();
		}
		return proc;	
	}
			
	protected List<String> getreadLine(Process proc) {
		String result = null;
		List<String> resulttextlist = new ArrayList<String>();
		try {
			proc.waitFor();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} 
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
}
