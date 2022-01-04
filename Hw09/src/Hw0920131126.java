import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hw0920131126 {
	public static void main(String args[]){
		MFrame frm =new MFrame();
		frm.setVisible(true);
	}

}
class MFrame extends JFrame{
	private static Container cp;
	private static JPanel jpl1 = new JPanel();
	private static JPanel jpl2 =  new JPanel();
	private static JLabel [] jlb = new JLabel[10];
	private static JButton jbtnGo = new JButton("Go");
	private static JButton jbtnPause = new JButton("Pause");
	JButton jbtnExit = new JButton("Exit");
	
	int h=0,m=0,s=0;
	Timer t1;
	ImageIcon[] img = new ImageIcon[10];
	public MFrame(){
		init();
	}
	private void init(){
		setBounds(200,200,400,200);
		cp=this.getContentPane();
		cp.setLayout(new GridLayout(2,1));
		jpl1.setLayout(new GridLayout(1,6,5,5));
		jpl2.setLayout(new GridLayout(1,3,5,5));
		cp.add(jpl1);
		cp.add(jpl2);
		for(int i=0;i<10;i++)
		{
			img[i]=new ImageIcon("src/"+i+".png");
			
		}
		for(int i=0;i<9;i++)
		{
			jlb[i]=new JLabel();
			jpl1.add(jlb[i]);
		}
		jlb[2].setText(":");
		jlb[5].setText(":");
		jlb[0].setIcon(img[0]);
		jlb[1].setIcon(img[0]);
		jlb[3].setIcon(img[0]);
		jlb[4].setIcon(img[0]);
		jlb[6].setIcon(img[0]);
		jlb[7].setIcon(img[0]);
		jpl2.add(jbtnGo);
		jpl2.add(jbtnPause);
		jpl2.add(jbtnExit);
		t1=new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				s++;
				if(s==60)
				{
					m++;
					s=0;
				}
				else if(m==60)
				{
					h++;
					m=0;
				}
				jlb[6].setIcon(img[(int)s/10]);
				jlb[7].setIcon(img[s%10]);
				jlb[3].setIcon(img[(int)m/10]);
				jlb[4].setIcon(img[m%10]);
				jlb[0].setIcon(img[(int)h/10]);
				jlb[1].setIcon(img[h%10]);
			}
		});
		
		
		jbtnGo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent eg){
				t1.start();
				jbtnGo.setText("Go");
			}
		});
		jbtnPause.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ep){
				t1.stop();
				jbtnGo.setText("Continue");
			}
		});
		jbtnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent xe){
				System.exit(0);
			}
		});
		addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent ex){
				System.exit(0);
			}
		});
	}
}
