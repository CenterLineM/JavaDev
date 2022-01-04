import java.awt.*;
import java.awt.event.*;

public class MFrame extends Frame{
	
	private static Label labS = new Label("Show word");
	private static Label labH = new Label("Height");
	private static TextField tfS = new TextField("");
	private static TextField tfH = new TextField("");
	private static Button btnr = new Button("Run");
	private static TextArea ta = new TextArea(0,20);
	private static List lt = new List(1,true);
	private static Panel pl = new Panel();
	int H;
	public MFrame(){
		setBounds(200,200,500,500);
		setLayout(new BorderLayout(5,5));
		add(pl,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		pl.setLayout(new GridLayout(2,3));
		pl.add(labS);
		pl.add(tfS);
		pl.add(lt);
		pl.add(labH);
		pl.add(tfH);
		pl.add(btnr);
		
		lt.add("◣");
		lt.add("◤");
		lt.add("◢");
		lt.add("◥");
		lt.add("▲");
		lt.add("△");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				Window w =e.getWindow();
				w.dispose();
			}
		});
		btnr.addActionListener(new ActLis());
		
		
	}
	class ActLis implements ActionListener{
		public void actionPerformed(ActionEvent ea){
			Button btnTmp = (Button)ea.getSource();
			ta.setText("");
			if(btnTmp==btnr)
			{
				//ta.setText("");
				String opr =lt.getSelectedItem();
				
				String S=tfS.getText();
				//String[] s2={"◣","◤","◢","◥","▲","△"};
				
				if(opr=="◣")
				{
					H=Integer.parseInt(tfH.getText());
					for(int i=0;i<H;i++)
					{
						for(int j=0;j<=i;j++)
						{
							ta.append(S);
						}
						ta.append("\n");
					}
					opr="";
				}
				else if(opr=="◤")
				{
					H=Integer.parseInt(tfH.getText());
					for(int i=H;i<=H;i--)
					{
						for(int j=H;j<=H;j--)
						{
							ta.append(S);
						}
						ta.append("\r\n");
					}
				}
				else if(opr=="◢")
				{
					 H=Integer.parseInt(tfH.getText());
					 for(int i=1;i<=H;i++)
						{
							   for(int j=H;j>i;j--)
							   {
								   ta.append(" ");
							   }
							   for(int k=1;k<=i;k++)
							   {
								   ta.append(S);
							   }
							   ta.append("\r\n");
						}
				}
				else if(opr=="◥")
				{
					H=Integer.parseInt(tfH.getText());
					for(int i=H;i>=1;i--)
					{
						for(int j=H;j>i;j--)
						{
							ta.append(" ");
						}
					    for(int k=1;k<=i;k++)
					    {
							ta.append(S);
					    }
					    ta.append("\r\n");
					}
				}
				else if(opr=="▲")
				{
					H=Integer.parseInt(tfH.getText());
					for(int i=1;i<=H;i++)
					{
						for(int j=H-i;j>0;j--)
						{
							ta.append(" ");
						}
						for(int k=0;k<i*2-1;k++)
						{
							ta.append(S);
						}
						ta.append("\r\n");
					}
					
				}
				else if(opr=="△")
				{
					H=Integer.parseInt(tfH.getText());
					for(int i=1;i<=H;i++)
					{
						for(int j=1;j<=H-i ;j++ )
						{
							ta.append(" ");
						}
						for(int k=1;k<=(i-1)*2+1 ;k++ )
						{
							if(i==1||i==H)
	            		    {
								ta.append(S);
	            		    }
	            		    else if(k==1||k==(i-1)*2+1)
	            		    {
	            		    	ta.append(S);
	            		    }
	            		    else
	            		    {
	            		    	ta.append(" ");
	            		    }
							
	            		    }
						ta.append("\r\n");
	            	}
				}
			}
		}
	}
}
