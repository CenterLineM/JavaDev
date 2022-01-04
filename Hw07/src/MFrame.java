import java.awt.*;
import java.awt.event.*;


public class MFrame extends Frame{
	private static Label lab = new Label("Test year");
	private static TextField Tin = new TextField("");
	private static Button btnT = new Button("Test");
	private static Button btnE = new Button("Exit");
	private static TextArea ta = new TextArea(20,30);
	private static Panel pnl = new Panel();
	public MFrame(){
		Init();
	}
	private void Init(){
		super.setTitle("Analyzing leap year");
		setBounds(100,100,500,600);
		setLayout(new BorderLayout());
		add(pnl,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		pnl.setLayout(new GridLayout(1,4,4,4));
		pnl.add(lab);
		pnl.add(Tin);
		pnl.add(btnT);
		pnl.add(btnE);
		
		btnT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ea){
				int yearin = Integer.parseInt(Tin.getText());
				if(yearin%100 ==0)
				{
					if((yearin%400)==0)
					{
						ta.setText(Tin.getText()+" is leap year(400)"+"\n\r");
					}
					else
					{
						ta.setText(Tin.getText()+" is not leap year(No)"+"\n\r");
						yearin=yearin-4;
						ta.setText((Integer.toString(yearin))+" is leap year(N2)"+"\n\r");
						yearin=yearin+4;
						ta.setText((Integer.toString(yearin))+" is leap year(N1)"+"\n\r");
					}
					
				}
				else if((yearin%100)!=0 && (yearin%4)==0)
				{
					ta.setText(Tin.getText()+"is leap year(100/4)"+"\n\r");
				}
				else
				{
					ta.setText(Tin.getText()+" isn't leap year (e)"+"\n\r");
					for(int i=yearin;i<=yearin+8;i++)
					{
						if((i%100)!=0 && (i%4)==0)
						{
							ta.setText((Integer.toString(yearin))+" is  leap year (e1)"+"\n\r");
						}
					}
					for(int i=yearin;i>=yearin-8;i--)
					{
						if((i%100)!=0 && (i%4)==0)
						{
							ta.setText((Integer.toString(yearin))+" is  leap year (e2)"+"\n\r");
						}
					}
				}
				
			}
		});
		
		btnE.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
	}

}
