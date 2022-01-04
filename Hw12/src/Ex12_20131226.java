import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ex12_20131226 extends JFrame{
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
	private static JLabel jlbMous = new JLabel();
	JLabel jlbMap = new JLabel();
	JPanel jpl = new JPanel();
	private void init() {
		// TODO Auto-generated method stub
		int [][]Mapwall ={{0,1,0},
				          {0,0,0},
				          {1,0,1}};
		setBounds(200,200,600,600);
		cp=getContentPane();
		cp.setLayout(new BorderLayout());
		jpl.setLayout(null);;
		cp.add(jpl,BorderLayout.CENTER);
		jlbMous.setIcon(new ImageIcon("src/mouse.jpg"));
		jlbMap.setIcon(new ImageIcon("src/map.png"));
		((JPanel)this.getContentPane()).setOpaque(false);
		this.getLayeredPane().add(jlbMap,new Integer(Integer.MIN_VALUE));
		jpl.add(jlbMous);
		jpl.add(jlbMap);
		jlbMous.setBounds(0,0,60,60);
		jlbMap.setBounds(0,0,600,600);
		jpl.setOpaque(false);
		this.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent ek){
				switch(ek.getKeyCode())
				{
				case 37:
					if(jlbMous.getX()-32>0)
						jlbMous.setLocation(jlbMous.getX()-64,jlbMous.getY());
					break;
				case 39:
					if(jlbMous.getX()+128<jpl.getWidth())
						jlbMous.setLocation(jlbMous.getX()+64,jlbMous.getY());
					break;
				case 38:
					if(jlbMous.getY()-64>0)
						jlbMous.setLocation(jlbMous.getX(),jlbMous.getY()-64);
					break;
				case 40:
					if(jlbMous.getY()+64<jpl.getHeight())
						jlbMous.setLocation(jlbMous.getX(), jlbMous.getY()+64);
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

