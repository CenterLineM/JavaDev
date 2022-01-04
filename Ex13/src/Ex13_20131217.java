import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ex13_20131217 extends JFrame{
	public static void main(String[] args) {
		MFrame frm = new MFrame();
		frm.setVisible(true);
	}
}
class MFrame extends JFrame{
	public MFrame(){
		init();
	}
	private static Container cp;
	private static JLabel jlbCar = new JLabel();
	JLabel jlbMap = new JLabel();
	JPanel jpl = new JPanel();
	private void init() {
		// TODO Auto-generated method stub
		
		setBounds(200,200,600,600);
		cp=getContentPane();
		cp.setLayout(new BorderLayout());
		jpl.setLayout(null);;
		cp.add(jpl,BorderLayout.CENTER);
		jlbCar.setIcon(new ImageIcon("src/car.png"));
		jlbMap.setIcon(new ImageIcon("src/map.jpg"));
		((JPanel)this.getContentPane()).setOpaque(false);
		this.getLayeredPane().add(jlbMap,new Integer(Integer.MIN_VALUE));
		jpl.add(jlbCar);
		jpl.add(jlbMap);
		jlbCar.setBounds(0,0,64,64);
		jlbMap.setBounds(1,1,570,570);
		jpl.setOpaque(false);
		this.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent ek){
				switch(ek.getKeyCode())
				{
				case 37:
					if(jlbCar.getX()-64>0)
						jlbCar.setLocation(jlbCar.getX()-64,jlbCar.getY());
					break;
				case 39:
					if(jlbCar.getX()+128<jpl.getWidth())
						jlbCar.setLocation(jlbCar.getX()+64,jlbCar.getY());
					break;
				case 38:
					if(jlbCar.getY()-64>0)
						jlbCar.setLocation(jlbCar.getX(),jlbCar.getY()-64);
					break;
				case 40:
					if(jlbCar.getY()+128<jpl.getHeight())
						jlbCar.setLocation(jlbCar.getX(), jlbCar.getY()+64);
					break;
				}
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		setVisible(true);
		
	}

}

