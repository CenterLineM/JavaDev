import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import javax.swing.*;

public class Ex11_20131211 {
	public  static void main(String arg[ ]){
		MFrame frm = new MFrame();
		frm.setVisible(true);
	}

}
class MFrame extends JFrame{
	public MFrame(){
		init();
	}
	private static Container cp;
	private static JPanel jpl1= new JPanel(); //Drawing area
	private static JPanel jpl2 = new JPanel();//Place Button area
	private static JPanel jpl3 = new JPanel();//Drawing tools area
	private static JPanel jpl4 = new JPanel();//Keyin
	//wait delete
	private static JButton jbtnLine = new JButton("Line");
	private static JButton jbtnRet = new JButton("Rectangle");
	private static JButton jbtnCir = new JButton("Circle");
	//
	private static JButton jbtnCle = new JButton("Clear");
	private static JButton jbtnDT = new JButton("Display");
	private static java.util.Random rnd = new java.util.Random();
	
	private static JButton jbtnColor = new JButton("SetColor");
	private static JColorChooser jcc = new JColorChooser();
	private static Color color1 = new Color(0,0,255); //Memory Color 
	private static JRadioButton jrbG = new JRadioButton("Graphics");
	private static JRadioButton jrbP = new JRadioButton("Pen");
	private static JRadioButton jrbRect = new JRadioButton("Rectangle");
	private static JRadioButton jrbLin = new JRadioButton("Line");
	private static JRadioButton jrbCir = new JRadioButton("Circle");
	//set Menu
	JMenu jmuSet = new JMenu("Change Font");
	JMenuBar jmb = new JMenuBar();
	JRadioButtonMenuItem jmfm = new JRadioButtonMenuItem("Monospace");
	//String input
	JTextField tf = new JTextField("Key in");
	JTextField tfx = new JTextField("0");
	JTextField tfy = new JTextField("0");
	//
	
	private static ButtonGroup gnp = new ButtonGroup();
	int x1,y1;
	private void init(){
		setBounds(200,200,600,500);
		cp=this.getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(jpl1,BorderLayout.CENTER);
		cp.add(jpl2,BorderLayout.SOUTH);
		jpl2.setLayout(new GridLayout(1,2,5,1));
		cp.add(jpl3,BorderLayout.WEST);
		jpl3.setLayout(new GridLayout(5,1,1,5));
		cp.add(jpl4,BorderLayout.NORTH);
		jpl4.setLayout(new GridLayout(2,2,1,1));
		jpl2.add(jbtnLine);
		jpl2.add(jbtnRet);
		jpl2.add(jbtnCir);
		jpl2.add(jbtnDT);
		jpl2.add(jbtnColor);
		jpl2.add(jbtnCle);
		
		this.setJMenuBar(jmb);
		jmb.add(jmuSet);
		jmuSet.add(jmfm);
		//Key String insert
		jpl4.add(tfx);
		jpl4.add(tfy);
		jpl4.add(tf);
		
		jbtnLine.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent el){
				Graphics g = jpl1.getGraphics();
				int h = jpl1.getHeight();
				int w = jpl1.getWidth();
				g.setColor(color1);
				for(int i=0;i<h;i+=10)
				{
					g.drawLine(0, i, i, h);
				}
				for(int i=0;i<h;i+=10)
				{
					g.drawLine(i, 0, h, i);
				}
				//???
				for(int i=h;i>0;i-=10)
				{
					for(int j=0;j<w;j+=10)
					{
						g.drawLine(0, i, j, 0);
					}
				}
	           	//???
				//some must do!
			}
		});
		jbtnRet.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent er){
				Graphics g = jpl1.getGraphics();
				int x=Integer.parseInt(tfx.getText());
				int y=Integer.parseInt(tfy.getText());
				g.setColor(color1);
				if(x+20<jpl1.getWidth() && (y+20)<jpl1.getHeight())
				{
					g.drawRect(x, y, 20, 20);
				}
				
			}
		});
		jbtnCir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ec){
				Graphics g = jpl1.getGraphics();
				int x=Integer.parseInt(tfx.getText());
				int y=Integer.parseInt(tfy.getText());
				g.setColor(color1);
				if(x+20<jpl1.getWidth() && (y+20)<jpl1.getHeight())
				{
					g.fillOval(x, y, 20, 20);
				}
			}
		});
		jbtnDT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent et){
				String keyin =tf.getText();
				Graphics g = jpl1.getGraphics();
				int x=Integer.parseInt(tfx.getText());
				int y=Integer.parseInt(tfy.getText());
				g.setFont(new Font("Monospace",Font.BOLD,12));
				g.setColor(color1);
				g.drawString(keyin, x, y);
			}
		});
		jbtnCle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent er){
				Graphics g = jpl1.getGraphics();
				g.clearRect(0, 0, jpl1.getWidth(), jpl1.getHeight());
			}
		});
		
		jbtnColor.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ec){
				color1 = jcc.showDialog(null,"Color choose", Color.red);
			}
		});
		//
		jpl3.add(jrbG);
		jpl3.add(jrbP);
		jpl3.add(jrbLin);
		jpl3.add(jrbRect);
		jpl3.add(jrbCir);
		//
		jpl1.addMouseListener(new MouseListener(){
			public void mousePressed(MouseEvent ep){
				x1=ep.getX();
				y1=ep.getY();
			}
			public void mouseReleased(MouseEvent er){
				int x2=er.getX();
				int y2=er.getY();
				Graphics g = jpl1.getGraphics();
				g.setColor(color1);
				if(jrbLin.isSelected())
				{
					g.drawLine(x1, y1, x2, y2);
				}
				if(jrbRect.isSelected())
				{
					/*Draw Rectangle
					 * */
					if(x2>x1)
					{
						if(y2>y1)
						{
							g.drawRect(x1, y1, x2-x1, y2-y1);
						}
						else
						{
							g.drawRect(x1, y2, x2-x1, y1-y2);
						}
					}
					else
					{
						if(y2>y1)
						{
							g.drawRect(x2, y1, x1-x2, y2-y1);
						}
						else
						{
							g.drawRect(x2, y2, x1-x2, y1-y2);
						}
					}
				}
				if(jrbP.isSelected())
				{
					
				}
				if(jrbCir.isSelected())
				{
					if(x2>x1)
					{
						if(y2>y1)
						{
							g.drawOval(x1, y1, x2-x1, y2-y1);
						}
						else
						{
							g.drawOval(x1, y2, x2-x1, y1-y2);
						}
						
					}
					else
					{
						if(y2>y1)
						{
							g.drawOval(x2, y1, x1-x2, y2-y1);
						}
						else
						{
							g.drawOval(x2, y2, x1-x2, y1-y2);
						}
					}
				}
			}
			@Override
			public void mouseClicked(MouseEvent mc) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ec){
				System.exit(0);
			}
		});
	}
}