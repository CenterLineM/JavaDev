import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
	private Label labKm = new Label("Kilometer");
	private Label labM = new Label("Mile");
	private Label labG = new Label("Grames");
	private Label labP = new Label("Pound");
	private Label labF = new Label("Fahrenheit");
	private Label labC = new Label("Celsius");
	
	//private Label test =new Label("Hello");
	
	private Button btnKM = new Button(" → ");
	private Button btnMK = new Button(" ← ");
	private Button btnGP = new Button(" → ");
	private Button btnPG = new Button(" ← ");
	private Button btnFC = new Button(" → ");
	private Button btnCF = new Button(" ← ");
	private Button btnExit = new Button("Exit");
	/**
	 * All kinds Unit transform
	 */
	private TextField ttKm = new TextField("1");
	private TextField ttM = new TextField("0.6215");
	private TextField ttG = new TextField("1");
	private TextField ttP = new TextField("0.002205");
	private TextField ttF = new TextField("1");
	private TextField ttC = new TextField("-17.2222222");
	



	//Read Numeric
	
	public MyFrame(){
		funTra();
	}
	public void funTra(){
		this.setBounds(100,200,800,800);
		this.setLayout(null);
		//Font must change back !!!!
		labKm.setBounds(15,40,80,20);
		labKm.setFont(new Font("Monospace",Font.BOLD,14));
		labKm.setAlignment(Label.CENTER);
		labKm.setBackground(Color.BLACK);
		labKm.setForeground(Color.YELLOW);
		this.add(labKm);
		
		labM.setBounds(450,40,80,20);
		labM.setFont(new Font("Monospace",Font.BOLD,14));
		labM.setAlignment(Label.CENTER);
		labM.setBackground(Color.BLACK);
		labM.setForeground(Color.YELLOW);
		this.add(labM);
		
		labG.setBounds(15,100,80,20);
		labG.setFont(new Font("Monospace",Font.BOLD,14));
		labG.setAlignment(Label.CENTER);
		labG.setBackground(Color.BLACK);
		labG.setForeground(Color.YELLOW);
		this.add(labG);
		
		labP.setBounds(450,100,80,20);
		labP.setFont(new Font("Monospace",Font.BOLD,14));
		labP.setAlignment(Label.CENTER);
		labP.setBackground(Color.BLACK);
		labP.setForeground(Color.YELLOW);
		this.add(labP);
		
		labF.setBounds(15,180,80,20);
		labF.setFont(new Font("Monospace",Font.BOLD,14));
		labF.setAlignment(Label.CENTER);
		labF.setBackground(Color.BLACK);
		labF.setForeground(Color.YELLOW);
		this.add(labF);
		
		labC.setBounds(450,180	,80,20);
		labC.setFont(new Font("Monospace",Font.BOLD,14));
		labC.setAlignment(Label.CENTER);
		labC.setBackground(Color.BLACK);
		labC.setForeground(Color.YELLOW);
		this.add(labC);
		/*
		test.setBounds(500,300,100,100);
		test.setFont(new Font("Monospace",Font.BOLD,14));
		test.setAlignment(Label.CENTER);
		test.setBackground(Color.BLACK);
		test.setForeground(Color.YELLOW);
		this.add(test);
		**/
		/*
		 * Down side
		 * set TextField !
		 * */
		ttKm.setBounds(100,40,100,50);
		ttKm.setFont(new Font("Monospace",Font.BOLD,14));
		ttKm.setBackground(Color.gray);
		ttKm.setForeground(Color.blue);
		this.add(ttKm);
		
		ttM.setBounds(340,40,100,50);
		ttM.setFont(new Font("Monospace",Font.BOLD,14));
		ttM.setBackground(Color.gray);
		ttM.setForeground(Color.cyan);
		this.add(ttM);
		
		ttG.setBounds(100,100,100,50);
		ttG.setFont(new Font("Monospace",Font.BOLD,14));
		ttG.setBackground(Color.gray);
		ttG.setForeground(Color.green);
		this.add(ttG);
		
		ttP.setBounds(340,100,100,50);
		ttP.setFont(new Font("Monospace",Font.BOLD,14));
		ttP.setBackground(Color.gray);
		ttP.setForeground(Color.lightGray);
		this.add(ttP);
		
		ttF.setBounds(100,180,100,50);
		ttF.setFont(new Font("Monospace",Font.BOLD,14));
		ttF.setBackground(Color.gray);
		ttF.setForeground(Color.darkGray);
		this.add(ttF);
		
		ttC.setBounds(340,180,100,50);
		ttC.setFont(new Font("Monospace",Font.BOLD,14));
		ttC.setBackground(Color.gray);
		ttC.setForeground(Color.magenta);
		this.add(ttC);
		/*
		 * Down line
		 * set Button !
		 * */
		btnKM.setBounds(220,40,80,20);
		btnKM.setFont(new Font("Monospace",Font.BOLD,14));
		btnKM.setBackground(Color.gray);
		this.add(btnKM);
		btnKM.addActionListener(new ActLis());
		
		btnMK.setBounds(220,60,80,20);
		btnMK.setFont(new Font("Monospace",Font.BOLD,14));
		btnMK.setBackground(Color.gray);
		this.add(btnMK);
		btnMK.addActionListener(new ActLis());
		
		btnGP.setBounds(220,100,80,20);
		btnGP.setFont(new Font("Monospace",Font.BOLD,14));
		btnGP.setBackground(Color.gray);
		this.add(btnGP);
		btnGP.addActionListener(new ActLis());
		
		btnPG.setBounds(220,120,80,20);
		btnPG.setFont(new Font("Monospace",Font.BOLD,14));
		btnPG.setBackground(Color.gray);
		this.add(btnPG);
		btnPG.addActionListener(new ActLis());
		
		btnFC.setBounds(220,180,80,20);
		btnFC.setFont(new Font("Monospace",Font.BOLD,14));
		btnFC.setBackground(Color.gray);
		this.add(btnFC);
		btnFC.addActionListener(new ActLis());
		
		btnCF.setBounds(220,200,80,20);
		btnCF.setFont(new Font("Monospace",Font.BOLD,14));
		btnCF.setBackground(Color.gray);
		this.add(btnCF);
		btnCF.addActionListener(new ActLis());
		
		btnExit.setBounds(480,720,80,20);
		btnExit.setFont(new Font("Monospace",Font.BOLD,16));
		this.add(btnExit);
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}});
		//this.addWindowListener(new WindowAdapter(){public void windwosClosing(WindowEvent e){System.exit(0);}});
	}
	/**
	 * Call Inside Class
	 * */
	class ActLis implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Button btnTmp = (Button) e.getSource();
			if(btnTmp == btnKM)
			{
				double tKm =Double.parseDouble(ttKm.getText());
				double tM =Double.parseDouble(ttM.getText());
				tM=(tKm*0.6215);
				ttM.setText(Double.toString(tM));
			}
			else
			{
				if(btnTmp == btnMK)
				{
					double tKm =Double.parseDouble(ttKm.getText());
					double tM =Double.parseDouble(ttM.getText());
					tKm=tM*1.608;
					ttKm.setText(Double.toString(tKm));
					//test.setText(Double.toString(tM));
				}
				else
				{
					if(btnTmp == btnGP)
					{
						double tG =Double.parseDouble(ttG.getText());
						double tP =Double.parseDouble(ttP.getText());
						tP=tG*0.002205;
						ttP.setText(Double.toString(tP));
						//test.setText(Double.toString(tG));
					}
					else
					{
						if(btnTmp == btnPG)
						{
							double tG =Double.parseDouble(ttG.getText());
							double tP =Double.parseDouble(ttP.getText());
							tG=tP*453.592;
							ttG.setText(Double.toString(tG));
							//test.setText(Double.toString(tP));
						}
						else
						{
							if(btnTmp == btnFC)
							{
								double tF =Double.parseDouble(ttF.getText());
								double tC =Double.parseDouble(ttC.getText());
								tC=(tF-32)*5/9;
								ttC.setText(Double.toString(tC));
								//test.setText(Double.toString(tF));
							}
							else
							{
								if(btnTmp == btnCF)
								{
									double tF =Double.parseDouble(ttF.getText());
									double tC =Double.parseDouble(ttC.getText());
									tF=(tC*(9/5)+32);
									ttF.setText(Double.toString(tF));
									//test.setText(Double.toString(tC));
								}
							}
						}
					}
				}
			}
		}
	}

}
