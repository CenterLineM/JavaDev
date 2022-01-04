import java.awt.*;
import java.awt.event.*;
public class MFrame extends Frame {
	private Label labBG = new Label("背景顏色");
	private Label labR = new Label("Red"); //10
	private Label labG = new Label("Green");
	private Label labB = new Label("Blue");
	private Label labLoc = new Label("位置大小");
	private Label labX = new Label("X");
	private Label labY = new Label("Y");
	private Label labW = new Label("Width");
	private Label labH = new Label("Height");
	private static Label labM = new Label("亞大資訊工程學系");
	
	private Button btnExit = new Button("Exit"); //3
	private static Button btnColor = new Button("Color");
	private static Button btnLoc = new Button("Location");
	
	private static TextField ttR = new TextField("128"); //7
	private static TextField ttG = new TextField("128");
	private static TextField ttB = new TextField("128");
	private static TextField ttX = new TextField("128");
	private static TextField ttY = new TextField("128");
	private static TextField ttW = new TextField("128");
	private static TextField ttH = new TextField("128");
	
	public MFrame(){
		fun01();
		
	}
	public void fun01(){
		this.setBounds(100,200,800,800);
		this.setLayout(null);
		
		labBG.setBounds(20,20,80,20);
		labBG.setFont(new Font("標楷體",Font.BOLD,16));
		labBG.setAlignment(Label.CENTER);
		this.add(labBG);
		
		labR.setBounds(20,45,80,20);
		labR.setFont(new Font("標楷體",Font.BOLD,16));
		labR.setAlignment(Label.CENTER);
		this.add(labR);
		
		labB.setBounds(100,45,80,20);
		labB.setFont(new Font("標楷體",Font.BOLD,16));
		labB.setAlignment(Label.CENTER);
		this.add(labB);
		
		labG.setBounds(180,45,80,20);
		labG.setFont(new Font("標楷體",Font.BOLD,16));
		labG.setAlignment(Label.CENTER);
		this.add(labG);
		
		labLoc.setBounds(20,90,80,20);
		labLoc.setFont(new Font("標楷體",Font.BOLD,16));
		labLoc.setAlignment(Label.CENTER);
		this.add(labLoc);
		
		labX.setBounds(20,120,80,20);
		labX.setFont(new Font("標楷體",Font.BOLD,16));
		labX.setAlignment(Label.CENTER);
		this.add(labX);
		
		labY.setBounds(100,120,80,20);
		labY.setFont(new Font("標楷體",Font.BOLD,16));
		labY.setAlignment(Label.CENTER);
		this.add(labY);
		
		labW.setBounds(180,120,80,20);
		labW.setFont(new Font("標楷體",Font.BOLD,16));
		labW.setAlignment(Label.CENTER);
		this.add(labW);
		
		labH.setBounds(260,120,80,20);
		labH.setFont(new Font("標楷體",Font.BOLD,16));
		labH.setAlignment(Label.CENTER);
		this.add(labH);
		
		labM.setBounds(20,180,200,100);
		labM.setFont(new Font("標楷體",Font.BOLD,16));
		labM.setAlignment(Label.CENTER);
		this.add(labM);
		
		ttR.setBounds(30,65,80,20);
		ttR.setFont(new Font("標楷體",Font.BOLD,16));
		ttR.setBackground(new Color(100,250,250));
		this.add(ttR);
		
		ttG.setBounds(120,65,80,20);
		ttG.setFont(new Font("標楷體",Font.BOLD,16));
		ttG.setBackground(new Color(100,250,250));
		this.add(ttG);
		
		ttB.setBounds(200,65,80,20);
		ttB.setFont(new Font("標楷體",Font.BOLD,16));
		ttB.setBackground(new Color(100,250,250));
		this.add(ttB);
		
		ttX.setBounds(20,150,80,20);
		ttX.setFont(new Font("標楷體",Font.BOLD,16));
		ttX.setBackground(new Color(100,250,250));
		this.add(ttX);
		
		ttY.setBounds(100,150,80,20);
		ttY.setFont(new Font("標楷體",Font.BOLD,16));
		ttY.setBackground(new Color(100,250,250));
		this.add(ttY);
		
		ttW.setBounds(180,150,80,20);
		ttW.setFont(new Font("標楷體",Font.BOLD,16));
		ttW.setBackground(new Color(100,250,250));
		this.add(ttW);
		
		ttH.setBounds(260,150,80,20);
		ttH.setFont(new Font("標楷體",Font.BOLD,16));
		ttH.setBackground(new Color(100,250,250));
		this.add(ttH);
		
		btnExit.setBounds(480,720,80,20);
		btnExit.setFont(new Font("標楷體",Font.BOLD,16));
		this.add(btnExit);
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}});
		
		btnColor.setBounds(300, 100, 80, 20);
		btnColor.setFont(new Font("標楷體",Font.BOLD,16));
		this.add(btnColor);
		btnColor.addActionListener(new ActLis());
		
		int tX =Integer.parseInt(ttX.getText());
		int tY =Integer.parseInt(ttY.getText());
		int tW =Integer.parseInt(ttW.getText());
		int tH =Integer.parseInt(ttH.getText());
		
		btnLoc.setBounds(300, 180, 80, 20);
		btnLoc.setFont(new Font("標楷體",Font.BOLD,16));
		this.add(btnLoc);
		btnLoc.addActionListener(new ActLis());
		
		

	}
	
class ActLis implements ActionListener{
	public void actionPerformed(ActionEvent e){
		Button btnTmp = (Button) e.getSource();
		if(btnTmp == btnColor)
		{
			int tr =Integer.parseInt(ttR.getText());
			int tb =Integer.parseInt(ttB.getText());
			int tg =Integer.parseInt(ttG.getText());
			labM.setBackground(new Color(tr,tb,tg));
		}
		else
		{
			if(btnTmp == btnLoc)
			{
				int tX =Integer.parseInt(ttX.getText());
				int tY =Integer.parseInt(ttY.getText());
				int tW =Integer.parseInt(ttW.getText());
				int tH =Integer.parseInt(ttH.getText());
				//this.setBounds(tX,tY,tW,tH);
				
			}
		}
	}


}
}
