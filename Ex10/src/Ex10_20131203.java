import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
//import javax.swing.Timer;

public class Ex10_20131203 {
	public static void main(String ards[]){
		MFrame frm = new MFrame();
		frm.setVisible(true);
		
	}
}
class MFrame extends JFrame{
	private static Container cp;
	private static JButton[] jbtn = new JButton[9];
	private static JButton jbtnNext = new JButton("Next");
	private static JButton jbtnExit = new JButton("Exit");
	private static JLabel jlb = new JLabel();
	private static ImageIcon[] img = new ImageIcon[9];
	private static Random rnd = new Random();
	private static Timer t1,t2;
	private static JRadioButtonMenuItem jrbmiE = new JRadioButtonMenuItem();
	private static JRadioButtonMenuItem jrbmiM = new JRadioButtonMenuItem();
	private static JRadioButtonMenuItem jrbmiH = new JRadioButtonMenuItem();
	ButtonGroup gnp = new ButtonGroup();
	JMenuBar jmb = new JMenuBar();
	JMenu jmuSet = new JMenu("Set");
	int v1,v2;
	
	
	public MFrame(){
		init();
	}
	private void init(){
		setBounds(100,200,800,1000);
		cp=this.getContentPane();
		((JFrame) cp).setJMenuBar(jmb);
		jmb.add(jmuSet);
		jmuSet.add(jrbmiE);
		jmuSet.add(jrbmiM);
		jmuSet.add(jrbmiH);
		gnp.add(jrbmiE);
		gnp.add(jrbmiM);
		gnp.add(jrbmiH);
		jrbmiE.setSelected(true);
		jrbmiM.setSelected(true);
		jrbmiH.setSelected(true);
		if(jrbmiE.isSelected())
		{
			v1=6000;
		}
		else if(jrbmiM.isSelected())
		{
			v1=5000;
		}
		else if(jrbmiH.isSelected())
		{
			v1=2000;
		}
		cp.setLayout(new GridLayout(4,3,5,5));
		for(int i=0;i<9;i++)
		{
			img[i]=new ImageIcon("src/image/"+i+".jpg");
			
		}
		for(int i=0;i<9;i++)
		{
			jbtn[i]=new JButton();
			jbtn[i].setIcon(img[i]);
			cp.add(jbtn[i]);
		}
		cp.add(jlb);
		cp.add(jbtnNext);
		cp.add(jbtnExit);
		t1=new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent et){
				for(int i=0;i<9;i++)
				{
					jbtn[i].setIcon(null);
				}
				t1.stop();
			}
		});
		t1.start();
		t2=new Timer(100,new ActionListener(){
			public void actionPerformed(ActionEvent te){
				v2--;
				if(v2==0)
				{ for(int i=0;i<9;i++)
				  {
					jbtn[i].setEnabled(false);
				  }
				}
				else
				{
					jlb.setText("Leavings..."+v2+"second");
				}
			}
			
		});
		 jbtnNext.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent en){
				 int y =rnd.nextInt(9);
				 jlb.setIcon(img[y]);
			 }
		 });
		 jbtn[0].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[0].setIcon(img[0]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[0].setIcon(null);
			 }
		 });
		 jbtn[1].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[1].setIcon(img[1]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[1].setIcon(null);
			 }
		 });
		 jbtn[2].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[2].setIcon(img[2]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[2].setIcon(null);
			 }
		 });
		 jbtn[3].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[3].setIcon(img[3]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[3].setIcon(null);
			 }
		 });
		 jbtn[4].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[4].setIcon(img[4]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[4].setIcon(null);
			 }
		 });
		 jbtn[5].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[5].setIcon(img[5]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[5].setIcon(null);
			 }
		 });
		 jbtn[6].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[6].setIcon(img[6]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[6].setIcon(null);
			 }
		 });
		 jbtn[7].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[7].setIcon(img[7]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[7].setIcon(null);
			 }
		 });
		 jbtn[8].addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e1){
				 jbtn[8].setIcon(img[8]);
			 }
			 public void mouseReleased(MouseEvent e2){
				 jbtn[8].setIcon(null);
			 }
		 });
		 
	}
	
}