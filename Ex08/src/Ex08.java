import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ex08 {
	public static void main(String args[]){
		MFrame mfrm = new MFrame();
		mfrm.setVisible(true);
	}
}
class MFrame extends Frame{
	private static TextArea ta1=new TextArea(10,20);
	private static TextArea ta2=new TextArea(10,20);
	private static TextField key = new TextField();
	private static Panel pnl=new Panel();
	
	private static MenuBar mbar = new MenuBar();
	private static Menu menuFile = new Menu("File");
	private static Menu menuEdit = new Menu();
	private static Menu menuHelp = new Menu();
	
	private static Label lab = new Label("Key : ");
	private static Button btnExit = new Button("Exit");
	private static Button btnEncrypt = new Button("Encrypt");
	private static Button btnDecrypt = new Button("Decrypt");
	private static MenuItem mItem1 =new MenuItem("Open");
	private static MenuItem mItem2 =new MenuItem("Save");
	private static MenuItem mItem3 =new MenuItem("Exit");
	private static MenuItem mItem4 =new MenuItem("Abort");
	
	private static FileDialog fdlg;
	
	public MFrame(){
		super.setTitle("");
		initl();
	}
	private void initl(){
		setBounds(100,200,500,400);
		setLayout(new BorderLayout());
		add(ta1,BorderLayout.WEST);
		add(ta2,BorderLayout.EAST);
		add(pnl,BorderLayout.CENTER);
		pnl.setLayout(new GridLayout(5,1));
		//
		pnl.add(lab);
		pnl.add(key);
		pnl.add(btnEncrypt);
		pnl.add(btnDecrypt);
		pnl.add(btnExit);
		//
		btnEncrypt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int key1=Integer.parseInt(key.getText());
				char[] str = ta1.getText().toCharArray();
				int strlen = str.length;
				char[] str1 = new char[strlen];
				for(int i=0;i<strlen;i++)
				{ int v2 =(int)str[i]+key1;
				  str1[i]=(char)v2; }
				//for end
				ta2.setText("");
				ta2.setText(String.valueOf(str1));
			}
		});
		
		btnDecrypt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int key1=Integer.parseInt(key.getText());
				char[] str = ta2.getText().toCharArray();
				int strlen = str.length;
				char[] str1 = new char[strlen];
				for(int i=0;i<strlen;i++)
				{ int v2 =(int)str[i]-key1;
				  str1[i]=(char)v2; }
				//for end
				ta1.setText("");
				ta1.setText(String.valueOf(str1));
			}
		});
		
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		setMenuBar(mbar);
		mbar.add(menuFile);
		mbar.add(menuEdit);
		mbar.add(menuHelp);
		
		fdlg=new FileDialog(this);
		
		menuFile.add(mItem1);
		menuFile.add(mItem2);
		menuFile.add(mItem3);
		menuFile.add(mItem4);
		mItem1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				fdlg.setVisible(true);
				String flame = fdlg.getDirectory()+fdlg.getFile();
				try{
					FileInputStream f =new FileInputStream(flame);
					byte[] data = new byte[f.available()];
					f.read(data);
					ta1.setText(new String(data));
					f.close();
				}catch(IOException ioe){
					
				}
			}

		});
		mItem2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				fdlg.setVisible(true);
				String fName = fdlg.getDirectory()+fdlg.getFile();
				try{
					FileOutputStream fs =new FileOutputStream(fName);
					fs.write(ta2.getText().getBytes());
					fs.close();
				}catch(IOException ioe){
					System.out.println("Error");
				}
				
			}
		});
	}
}
