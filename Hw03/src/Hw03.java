import java.awt.*;
import java.awt.event.*;


public class Hw03 {
	private static Frame frm01 = new Frame();
	private static Label labX = new Label();
	private static Label labY = new Label();
	private static Label labS = new Label();
	
	private static Button btnUpr =new Button("↗");
	private static Button btnLowr =new Button("↘");
	private static Button btnUpl =new Button("↖");
	private static Button btnLowl=new Button("↙");
	
	static Button btnExit =new Button("Exit");
	
	static int xVal=170,yVal=220 ;//groble
	
	public static void main(String[] args) {
		frm01.setLayout(null);
		frm01.setBounds(170,220,500,500);
		
		labX.setBounds(50,80,80,20);
		labX.setBackground(Color.gray);
		labX.setFont(new Font("Timos New Roman",Font.BOLD,18));
		labX.setAlignment(Label.CENTER);
		labX.setForeground(Color.RED);
		
		labY.setBounds(130,80,80,20);
		labY.setBackground(Color.gray);
		labY.setFont(new Font("Timos New Roman",Font.BOLD,18));
		labY.setAlignment(Label.CENTER);
		labY.setForeground(Color.green);
		
		labS.setBounds(xVal,yVal,80,80);
		labS.setBackground(Color.BLACK);
		labS.setFont(new Font("Timos New Roman",Font.BOLD,18));
		labS.setAlignment(Label.CENTER);
		labS.setForeground(Color.yellow);
		
		frm01.add(labX);
		frm01.add(labY);
		frm01.add(labS);
		
		labX.setText(Integer.toString(xVal));
		labY.setText(Integer.toString(yVal));
		
		btnExit.setBounds(410,470,80,20);
		
		btnUpl.setBounds(50,100,80,20);
		btnLowl.setBounds(50,120,80,20);
		btnUpr.setBounds(130,100,80,20);
		btnLowr.setBounds(130,120,80,20);
		
		frm01.add(btnExit);
		frm01.add(btnUpl);
		frm01.add(btnUpr);
		frm01.add(btnLowl);
		frm01.add(btnLowr);
		
		btnExit.addActionListener(new ActLis());
		btnUpl.addActionListener(new ActLis());
		btnUpr.addActionListener(new ActLis());
		btnLowl.addActionListener(new ActLis());
		btnLowr.addActionListener(new ActLis());
		
		frm01.setVisible(true);
		btnUpl.setVisible(true);
		btnUpr.setVisible(true);
		btnLowl.setVisible(true);
		btnLowr.setVisible(true);
		btnExit.setVisible(true);
		labX.setVisible(true);
		labY.setVisible(true);
		labS.setVisible(true);
		// TODO Auto-generated method stub
		
		

	}



static class ActLis implements ActionListener{
	
	public void actionPerformed(ActionEvent ae){
		Button btnTmp =(Button) ae.getSource();
		if(btnTmp == btnExit)
		{
			System.exit(0);
		}
		else
		{
			if(btnTmp == btnUpl)
			{	
				xVal=xVal-5;
				yVal=yVal-5;
				labS.setBounds(xVal,yVal,80,80);
				labX.setText(Integer.toString(xVal));
				labY.setText(Integer.toString(yVal));
			}
			else
			{
				if(btnTmp == btnUpr)
				{
					xVal=xVal+5;
				    yVal=yVal-5;
					labS.setBounds(xVal,yVal,80,80);
				    labX.setText(Integer.toString(xVal));
				    labY.setText(Integer.toString(yVal));
					
				}
				else
				{
					if(btnTmp == btnLowl)
					{
						xVal=xVal-5;
				        yVal=yVal+5;
						labS.setBounds(xVal,yVal,80,80);
				        labX.setText(Integer.toString(xVal));
				        labY.setText(Integer.toString(yVal));
					}
					else
					{
						if(btnTmp == btnLowr)
						{
							xVal=xVal+5;
				            yVal=yVal+5;
							labS.setBounds(xVal,yVal,80,80);
				            labX.setText(Integer.toString(xVal));
				            labY.setText(Integer.toString(yVal));
						}
						else
						{
							labS.setBounds(xVal,yVal,80,80);
				            labX.setText(Integer.toString(xVal));
				            labY.setText(Integer.toString(yVal));
						}
					}
				}
			}
		}
	}
}
		
		
}
