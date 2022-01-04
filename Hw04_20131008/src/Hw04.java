import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Hw04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyFrame frmOne =new MyFrame();
		frmOne.setVisible(true);
		frmOne.addWindowListener(new WindowAdapter(){public void windwosClosing(WindowEvent e){System.exit(0);}});
		// TODO Auto-generated method stub

	}

}
