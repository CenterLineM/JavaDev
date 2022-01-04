import java.awt.*;
import java.awt.event.*;

public class Login extends Frame{
	private static Label labID = new Label("ID");
	private static Label labPW = new Label("PW");
	private static TextField tfID = new TextField("");
	private static TextField tfPW = new TextField("");
	private static Button btnOK = new Button("OK");
	private static Button btnExit = new Button("Exit");
	public Login(){
		setBounds(250,250,500,400);
		setLayout(new GridLayout(3,2));
		add(labID);
		add(labPW);
		add(tfID);
		add(tfPW);
		add(btnOK);
		add(btnExit);
		tfPW.setEchoChar('*');
		btnOK.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfID.getText().equals("CSIE") && tfPW.getText().equals("123456789"))
				{MFrame frm = new MFrame();
				 frm.setVisible(true);}
		        else
		        {tfID.setText("");
		         tfPW.setText("");}
			}
		});
		btnExit.addActionListener(new ActionListener(){
			                      public void actionPerformed(ActionEvent ea){
			                    	  System.exit(0);
			                      }
		                          });
		
	}

}
