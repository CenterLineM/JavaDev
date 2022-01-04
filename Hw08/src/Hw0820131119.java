import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hw0820131119 {
	public static void main(String arg[]){
		MFrame frm= new MFrame();
		frm.setVisible(true);
	}

}
class MFrame extends JFrame{
	public MFrame(){
		initComponents();
	}
	private static JLabel[] jlb = new JLabel[14];
	private static JTextField[] jtf = new JTextField[10];
	private static JComboBox[] jcb =new JComboBox[4];
	private static JButton jbtnExit = new JButton("Exit");
	private static JButton jbtnRun = new JButton("Run");
	private static Container cp = new Container();
	private static JPanel jpnN = new JPanel();
	private static JPanel jpnC = new JPanel();
	private static JPanel jpnS = new JPanel();
	
	private void initComponents(){
		cp=this.getContentPane();
		this.setBounds(200,200,400,200);
		cp.setLayout(new BorderLayout());
		jpnN.setLayout(new GridLayout(2,4));
		jpnC.setLayout(new GridLayout(3,6));
		jpnS.setLayout(new GridLayout(1,4));
		cp.add(jpnN,BorderLayout.NORTH);
		cp.add(jpnC,BorderLayout.NORTH);
		cp.add(jpnS,BorderLayout.SOUTH);
		//
		String[] str1 = {"10%","20%","30%","40%","50%"};
		for(int i=0;i<4;i++)
		{
			jcb[i]=new JComboBox();
			for(int j=0;j<5;j++)
			{
				jcb[i].addItem(str1[j]);
			}
		}
		//
		String[] str2 = {"Attendance","HomeWork","Midterm","Final Exam"};
		for(int i=0;i<4;i++)
		{
			jlb[i]=new JLabel(str2[i]);
		}
		for(int j=0;j<10;j++)
		{
			jtf[j]=new JTextField();
		}
		jpnN.add(jlb[0]);
		jpnN.add(jlb[1]);
		jpnN.add(jlb[2]);
		jpnN.add(jlb[3]);
		/*
		jpnC.add();
		jpnC.add();
		jpnC.add();
		*/
		//...
		jbtnRun.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1){
				float v2=0.0f;
				float[] rate={0.1f,0.2f,0.3f,0.4f,0.5f};
				 float v1=rate[jcb[0].getSelectedIndex()]+
						rate[jcb[1].getSelectedIndex()]+
						rate[jcb[2].getSelectedIndex()]+
						rate[jcb[3].getSelectedIndex()];
				if(v1== 1)
				{
					for(int i=3;i<9;i++)
					{
						v2=v2+Float.parseFloat(jtf[i].getText());
					}
					float v3 = Float.parseFloat(jtf[2].getText());
					float v4 = Float.parseFloat(jtf[0].getText())*rate[jcb[0].getSelectedIndex()]+Float.parseFloat(jtf[1].getText())*rate[jcb[2].getSelectedIndex()];
					
					v4=v4+v2*rate[jcb[1].getSelectedIndex()];
					v4=(v3-v4)/rate[jcb[3].getSelectedIndex()];
					jtf[9].setText(Float.toString(v4));
					jtf[9].setEditable(false);
					jtf[9].setBackground(Color.gray);
				}
			}
		});
		add(jbtnRun);
		add(cp);
		add(jpnN);
		add(jpnC);
		add(jpnS);
	}
}
