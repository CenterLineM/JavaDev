import java.awt.*;
import java.awt.event.*;
public class MyFrame extends Frame{
	static String keyin= "" ;
	
	private static Frame frm = new Frame("");
	private static TextField lab1 = new TextField();
	//private static Checkbox cb01 = new Checkbox("");
	private static Button cb01 = new Button(" = ");
	private static Panel pnl = new Panel();
	private static Button[] btns = new Button[16];
	
	private static boolean flag=true;
	private static boolean opa=false,ops=false,opc=false,opd=false;
	private static double oldn;
	private static double temp;
	private static double result;
	
	public MyFrame(){
		Init();
	}
	public void Init(){
		setBounds(100,150,300,500);
		setLayout(new BorderLayout());
		
		lab1.setFont(new Font("Monospace",Font.BOLD,14));
		lab1.setBackground(Color.BLACK);
		lab1.setForeground(Color.YELLOW);
		add(lab1,BorderLayout.NORTH);
		
		cb01.setFont(new Font("Monospace",Font.BOLD,14));
		cb01.setBackground(Color.BLACK);
		cb01.setForeground(Color.YELLOW);
		add(cb01,BorderLayout.SOUTH);
		cb01.addActionListener(new ActLis());
		
		add(pnl,BorderLayout.CENTER);
		pnl.setLayout(new GridLayout(4,4));
		
		String[] btnLab = {"7","8","9","+","4","5","6","-","1","2","3","*","0",".","C","/"};
		for(int i=0; i<16;i++)
		{
			btns[i]=new Button(btnLab[i]);
			pnl.add(btns[i]);
			btns[i].addActionListener(new ActLis());
			btns[i].setFont(new Font("Monospace",Font.BOLD,14));
		}
		
		frm.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ae)
			{
				System.exit(0);
			}
		});
		setVisible(true);
	}
public	static class ActLis implements ActionListener{
		public void actionPerformed(ActionEvent e){

			
			Button btnTmp = (Button) e.getSource();
			//.....
			if(btnTmp == btns[0])
				lab1.setText(lab1.getText()+"7");
			
			if(btnTmp == btns[1])
				lab1.setText(lab1.getText()+"8");
			
			if(btnTmp == btns[2])
				lab1.setText(lab1.getText()+"9");
			
			if(btnTmp == btns[3])// +
			{ 
				oldn =Double.parseDouble(lab1.getText());
				lab1.setText("");
				flag=true;
				opa=true;
			}
			
			if(btnTmp == btns[4])
				lab1.setText(lab1.getText()+"4");
			
			if(btnTmp == btns[5])
				lab1.setText(lab1.getText()+"5");
			
			if(btnTmp == btns[6])
				lab1.setText(lab1.getText()+"6");
			
			if(btnTmp == btns[7])// - 
			{ 
				oldn =Double.parseDouble(lab1.getText());
				lab1.setText("");
				flag=true;
				ops=true;
			}
			
			if(btnTmp == btns[8])
				lab1.setText(lab1.getText()+"1");
			
			if(btnTmp == btns[9])
				lab1.setText(lab1.getText()+"2");
				
			if(btnTmp == btns[10])
				lab1.setText(lab1.getText()+"3");
			
			if(btnTmp == btns[11])// * 
			{
				oldn =Double.parseDouble(lab1.getText());
				lab1.setText("");
				flag=true;
				opc=true;
			}
			
			if(btnTmp == btns[12])
				lab1.setText(lab1.getText()+"0");
			
			
			if(btnTmp == btns[13])
			{
				if(flag == true)
				{
					lab1.setText(lab1.getText()+".");
					flag=false;
				}
			}
			
			if(btnTmp == btns[14])
			{
				lab1.setText(keyin);
				flag=true;
			}
			
			if(btnTmp == btns[15])// /
			{
				oldn =Double.parseDouble(lab1.getText());
				lab1.setText("");
				flag=true;
				opd=true;
			}
			
			if(btnTmp == cb01)
			{
				if(opa==true)
				{
					temp=Double.parseDouble(lab1.getText());
					result=(oldn+temp);
					lab1.setText(""+result+"");
					flag=true;
					opa=false;
				}
				if(ops==true)
				{
					temp=Double.parseDouble(lab1.getText());
					result=(oldn-temp);
					lab1.setText(""+result+"");
					flag=true;
					ops=false;
				}
				if(opc==true)
				{
					temp=Double.parseDouble(lab1.getText());
					result=(oldn*temp);
					lab1.setText(""+result+"");
					flag=true;
					opc=false;
				}
				if(opd==true)
				{
					temp=Double.parseDouble(lab1.getText());
					result=(oldn/temp);
					lab1.setText(""+result+"");
					flag=true;
					opd=false;
				}
				
			}
		}

	}


}
