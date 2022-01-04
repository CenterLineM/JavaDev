
public class ch07_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CMyClass X = new CMyClass();
		CMyClass Y = new CMyClass();
		
		X.addVar(10);
		System.out.println("Object X \t");
		X.showVar();
		
		System.out.println("Object Y \t");
		Y.addVar(5);
		Y.showVar();
		
		System.out.println("Object Y \t");
		Y.addVar(3);
		Y.showVar();
		// TODO Auto-generated method stub

	}

}
class CMyClass{
	public void addVar(int b){
		Var=Var+b;
	}
	
	public void showVar(){
		realShow();
	}
	
	private int Var=1;
	private void realShow(){
		System.out.println("Var = " + Var);
	}
}