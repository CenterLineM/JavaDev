import java.awt.*;
import java.awt.event.*;
import java.awt.Event.*;

public class Login extends Frame{
	private static Label labID = new Label("ID");
	private static Label labPW = new Label("PW");
	private static TextField tfID = new TextField();
	private static TextField tfPW = new TextField();
	private static Button btnExit = new Button("Exit");
	private static Button btnOK = new Button("OK");
	public Login(){
		setBounds(200,200,300,200);
		setLayout(new GridLayout(3,2));
		add(labID);
		add(tfID);
		add(labPW);
		add(tfPW);
		add(btnOK);
		add(btnExit);
		
		tfPW.setEchoChar('*');
		btnOK.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfID.getText().equals("CSIE") &&  tfPW.getText().equals("123456789"))
				{
					MFrame frm = new MFrame();
					frm.setVisible(true);
					
				}else
				{
					tfID.setText("");
					tfPW.setText("");
				}
			}
		});
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
		
		
	}
	
	

}
