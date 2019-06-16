package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public abstract class FileToolFrame extends JFrame {
	
	JFrame f;
	JPanel panel;
	FrameManager ScMng;
	protected JButton Topbutton;
	protected JButton Maebutton;
	protected JButton Tugibutton;
	protected FileToolFrame currentFrame;
	

	public FileToolFrame(){
		currentFrame = this;
		f = new JFrame("VBSツール");
		f.setSize(450, 500);
		f.setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 450, 470);
		f.add(panel);
		ScMng = new FrameManager();
		Topbutton = new JButton("TOPに戻る");
		Topbutton.setBounds(170, 438, 105, 21);
		Maebutton = new JButton("前へ");
		Maebutton.setBounds(287, 438, 62, 21);
		Tugibutton = new JButton("次へ");
		Tugibutton.setBounds(361, 438, 62, 21);
		panel.add(Topbutton);
		panel.add(Maebutton);
		panel.add(Tugibutton);
		Topbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("FrameTop",currentFrame);
			}
		});

	}
	
	protected abstract void setGuiContllorer();
}


class MyWindowAdapter extends WindowAdapter {
    @Override
	public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}