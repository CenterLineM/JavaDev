import java.awt.*;
import java.awt.event.*;


public class Ex03 {
	private static Frame frm01 = new Frame();
	private static Label labR = new Label();
	private static Label labG = new Label();
	private static Label labB = new Label();
	private static Label labColor = new Label();
	
	private static Button btnRI =new Button("↑");
	private static Button btnRD =new Button("↓");
	private static Button btnGI =new Button("↑");
	private static Button btnGD =new Button("↓");
	private static Button btnBI =new Button("↑");
	private static Button btnBD =new Button("↓");
	static Button btnExit =new Button("Exit");
	
	static int rVal=128,gVal=128,bVal=128; //groble
	
	public static void main(String[] args) {
		frm01.setLayout(null);
		frm01.setBounds(100,150,500,400);
		
		labR.setBounds(50,80,80,20);
		labR.setBackground(Color.gray);
		labR.setFont(new Font("Timos New Roman",Font.BOLD,18));
		labR.setAlignment(Label.CENTER);
		labR.setForeground(Color.RED);
		
		labG.setBounds(130,80,80,20);
		labG.setBackground(Color.gray);
		labG.setFont(new Font("Timos New Roman",Font.BOLD,18));
		labG.setAlignment(Label.CENTER);
		labG.setForeground(Color.green);
		
		labB.setBounds(210,80,80,20);
		labB.setBackground(Color.gray);
		labB.setFont(new Font("Timos New Roman",Font.BOLD,18));
		labB.setAlignment(Label.CENTER);
		labB.setForeground(Color.BLUE);
		
		frm01.add(labR);
		frm01.add(labG);
		frm01.add(labB);
		
		labR.setText(Integer.toString(rVal));
		labG.setText(Integer.toString(gVal));
		labB.setText(Integer.toString(bVal));
		
		btnExit.setBounds(300,150,80,20);
		
		btnRI.setBounds(50,100,80,20);
		btnRD.setBounds(50,120,80,20);
		btnGI.setBounds(130,100,80,20);
		btnGD.setBounds(130,120,80,20);
		btnBI.setBounds(210,100,80,20);
		btnBD.setBounds(210,120,80,20);
		labColor.setBounds(50,100,240,240);
		
		frm01.add(btnExit);
		frm01.add(btnRI);
		frm01.add(btnGI);
		frm01.add(btnBI);
		frm01.add(btnRD);
		frm01.add(btnGD);
		frm01.add(btnBD);
		frm01.add(labColor);
		
		btnExit.addActionListener(new ActLis());
		btnRI.addActionListener(new ActLis());
		btnGI.addActionListener(new ActLis());
		btnBI.addActionListener(new ActLis());
		btnRD.addActionListener(new ActLis());
		btnGD.addActionListener(new ActLis());
		btnBD.addActionListener(new ActLis());
		
		frm01.setVisible(true);
		btnBI.setVisible(true);
		btnBD.setVisible(true);
		btnGI.setVisible(true);
		btnGD.setVisible(true);
		btnRD.setVisible(true);
		btnRI.setVisible(true);
		labB.setVisible(true);
		labR.setVisible(true);
		labG.setVisible(true);
		labColor.setVisible(true);
		labColor.setBackground(new Color(rVal,gVal,bVal));
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
			if(btnTmp == btnRI)
			{	
				rVal=rVal+5;
				labColor.setBackground(new Color(rVal,gVal,bVal));
				labR.setText(Integer.toString(rVal));
			}
			else
			{
				if(btnTmp == btnRD)
				{
					rVal=rVal-5;
					labColor.setBackground(new Color(rVal,gVal,bVal));
					labR.setText(Integer.toString(rVal));
				}
				else
				{
					if(btnTmp == btnGI)
					{
						gVal+=5;
						labColor.setBackground(new Color(rVal,gVal,bVal));
						labG.setText(Integer.toString(gVal));
					}
					else
					{
						if(btnTmp == btnGD)
						{
							gVal-=5;
							labColor.setBackground(new Color(rVal,gVal,bVal));
							labG.setText(Integer.toString(gVal));
						}
						else
						{
							if(btnTmp == btnBI)
							{
								bVal+=5;
								labColor.setBackground(new Color(rVal,gVal,bVal));
								labB.setText(Integer.toString(bVal));
							}
							else
							{
								if(btnTmp == btnBD)
								{
									bVal-=5;
									labColor.setBackground(new Color(rVal,gVal,bVal));
									labB.setText(Integer.toString(bVal));
								}
								else
								{
									labColor.setBackground(new Color(rVal,gVal,bVal));
								}
							}
						}
					}
				}
			}
		}
	}
		
		
	}}