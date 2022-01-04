import java.awt.*;
import java.awt.event.*;


public class MFrame extends Frame{
	
	private static Checkbox cbR = new Checkbox("Red");
	private static Checkbox cbG = new Checkbox("Green");
	private static Checkbox cbB = new Checkbox("Blue");
	private static Checkbox cbBOLD = new Checkbox("BOLD");
	private static Checkbox cbIALIC = new Checkbox("IALIC");
	
	private static CheckboxGroup grp = new CheckboxGroup();
	
	private static  List lst = new List(1,false);
	private static Panel pnl = new Panel();
	private static TextArea ta = new TextArea(0,20);
	
	public MFrame(){
		setBounds(200,200,400,400);
		setLayout(new BorderLayout(5,5));
		pnl.setLayout(new GridLayout(2,3));
		
		
		add(pnl,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		pnl.add(cbR);
		pnl.add(cbG);
		pnl.add(cbB);
		
		pnl.add(cbBOLD);
		pnl.add(cbIALIC);
		pnl.add(lst);
		
		cbR.setCheckboxGroup(grp);
		cbG.setCheckboxGroup(grp);
		cbB.setCheckboxGroup(grp);
		//cbBOLD.setCheckboxGroup(grp);
		//cbIALIC.setCheckboxGroup(grp);
		//...
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				Window w =e.getWindow();
				w.dispose();
			}
		});
		cbR.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				ta.setForeground(Color.RED);
				
			}
		});
		cbG.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				ta.setForeground(Color.GREEN);
				
			}
		});
		cbB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				ta.setForeground(Color.BLUE);
				
			}
		});
		cbBOLD.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				fontChange();
				
			}
		});
		cbIALIC.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				fontChange();
				
			}
		});
		
		lst.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				fontChange();
				
			}
		});
		
	}
	//
	private void fontChange(){
		int fontSize =Integer.parseInt(lst.getSelectedItem());
		int type=0;
		if(cbBOLD.getState())
		{
			if(cbIALIC.getState())
			{type=Font.BOLD+Font.ITALIC;}
			else
			{type = Font.BOLD;}
			
		}
		else
		{
			if(cbIALIC.getState())
			{type = Font.ITALIC;}
		}
		ta.setFont(new Font("Monospace",type,fontSize));
	}

}
