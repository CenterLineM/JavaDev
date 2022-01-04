import java.awt.*;
import java.awt.event.*;

public class Hw2_01{
   private static Frame mFrm01 = new Frame();
   private static Label lab01 = new Label();
   private static Button btn01 = new Button();
   private static Button btn02 = new Button();
   private static int pushCount ;
   private static int pushSum ;
   
   public static void main(String args[]){
	  
      mFrm01.setLayout(null);
      mFrm01.setBounds(100,150,300,200); //Location & Height,width
      mFrm01.setBackground(Color.cyan);
      mFrm01.setTitle("你按了"+(pushCount+1)+"次按鈕！累計值"+(pushSum+pushCount+1));
      mFrm01.setVisible(true);
      //
      lab01.setFont(new Font("標楷體",Font.ITALIC+Font.BOLD,20));
      lab01.setText("健康、關懷、創新、卓越");
      lab01.setBounds(50,75,240,50);
      lab01.setBackground(Color.pink);
      mFrm01.add(lab01);
      //
      btn01.setLabel(" Push Me ");
      btn01.setBounds(80,150,75,25);
      btn01.setBackground(Color.green);
      //mFrm01.add(btn01);
      btn01.addActionListener(new ActLis());
      
      btn02.setLabel(" Push Me ");
      btn02.setBounds(150,150,75,25);
      btn02.setBackground(Color.green);
      mFrm01.add(btn02);
      btn02.addActionListener(new ActLis());
      
      //ActLis addcount = new ActLis();
      //mFrm01.setTitle("你按了"+addcount.actionCounter()+"次按鈕！累計值？？");
      //btn01.setVisible(true);
      
      mFrm01.addWindowListener(new WindowAdapter(){
    	  public void windowClosing(WindowEvent e){
    		  System.exit(0);}});
   }
   
   static class ActLis implements ActionListener{

	 public void actionPerformed(ActionEvent e) {
		 Button btn01 = (Button) e.getSource() ;
		 if(btn02==btn01)
		 {
		 mFrm01.setTitle("你按了"+(pushCount+1)+"次按鈕！累計值"+(pushSum+pushCount+1));
			 
		 pushCount=pushCount+1;
		 pushSum=pushSum+pushCount;
	     }
     }
     /**
      * public void actionPerformed(ActionEvent e) {
	     // TODO Auto-generated method stub
	     count++;
	      sum=sum+count;
        }
	 public int actionCounter(){
	 return count;
	 }
      */
   }
   
}
