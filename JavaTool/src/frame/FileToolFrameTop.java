package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FileToolFrameTop extends FileToolFrame{
	public FileToolFrameTop() {
		panel = new JPanel();
		panel.setLayout(null);
		f.setSize(480, 540);
		panel.setBounds(0, 0, 480, 540);
		f.add(panel);
		JButton btnNewButton = new JButton("3-01_現在の日付や時刻を名前にしてフォルダを作成する");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame01",currentFrame);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBounds(12, 10, 440, 21);
		panel.add(btnNewButton);
		
		JButton button = new JButton("3-02_ファイル名に日付や時刻を加えてコピーする");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame02",currentFrame);
			}
		});
		button.setBounds(12, 41, 440, 21);
		panel.add(button);
		
		JButton button_1 = new JButton("3-04_ファイルが0バイトのファイルを削除する");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame04",currentFrame);
			}
		});
		button_1.setBounds(12, 103, 440, 21);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3-03_作成日から一定期間が経過したファイルを削除する");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame03",currentFrame);
			}
		});
		button_2.setBounds(12, 72, 440, 21);
		panel.add(button_2);
		
		JButton button_3 = new JButton("3-06_今日作成または更新したファイルを別のフォルダにコピーする");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame06",currentFrame);
			}
		});
		button_3.setBounds(12, 165, 440, 21);
		panel.add(button_3);
		
		JButton button_4 = new JButton("3-05_指定したフォルダに保存されているファイル一覧を表示する");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame05",currentFrame);
			}
		});
		button_4.setBounds(12, 134, 440, 21);
		panel.add(button_4);
		
		JButton button_5 = new JButton("3-07_条件に合うファイルを選択し、別フォルダにコピーする");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame07",currentFrame);
			}
		});
		button_5.setBounds(12, 196, 440, 21);
		panel.add(button_5);
		
		JButton button_6 = new JButton("3-08_ファイルを任意の個数に分割する");
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame08",currentFrame);
			}
		});
		button_6.setBounds(12, 227, 440, 21);
		panel.add(button_6);
		
		JButton button_7 = new JButton("3-09_複数のファイルを一つのファイルに結合する");
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame09",currentFrame);
			}
		});
		button_7.setBounds(12, 258, 440, 21);
		panel.add(button_7);
		
		JButton button_8 = new JButton("3-10_テキストファイルの一部分を別の内容に置き換える");
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame10",currentFrame);
			}
		});
		button_8.setBounds(12, 289, 440, 21);
		panel.add(button_8);
		
		JButton button_9 = new JButton("3-11_フラットファイルのレイアウトを変更する");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame11",currentFrame);
			}
		});
		button_9.setBounds(12, 320, 440, 21);
		panel.add(button_9);
		
		JButton button_10 = new JButton("3-12_ファイル名を一括リネームする");
		button_10.setHorizontalAlignment(SwingConstants.LEFT);
		button_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame12",currentFrame);
			}
		});
		button_10.setBounds(12, 351, 440, 21);
		panel.add(button_10);
		
		JButton button_12 = new JButton("3-13‗ファイルへ追加された部分を表示する_tailコマンド");
		button_12.setHorizontalAlignment(SwingConstants.LEFT);
		button_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScMng.reloadPanel("Frame13",currentFrame);
			}
		});
		button_12.setBounds(12, 382, 440, 21);
		panel.add(button_12);
		for(int i=0;i<panel.getComponentCount();i++) {
			panel.getComponent(i).setVisible(false);
			panel.getComponent(i).setVisible(true);
		}
		Topbutton.setVisible(false);
		Maebutton.setVisible(false);
		Tugibutton.setVisible(false);
	}

	@Override
	protected void setGuiContllorer() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
