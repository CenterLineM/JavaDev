
public class ch05_im03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m1[][]={{1,2,3},
					{4,5,6}};
		int m2[][]={{1,2},
					{3,4},
					{5,6}};
		int m3[][]=new int [1][1] ;
		//Array m1
		System.out.println("Before the operation matrix m1 : ");
		for(int i=0 ; i<2 ; i++)
		{
			for(int j=0 ; j<3 ; j++) 
			{
				System.out.print(" " + m1[i][j]);
			}
			System.out.println("");
		}
		//Array m2
				System.out.println("Before the operation matrix m2 : ");
				for(int i=0 ; i<3 ; i++)
				{
					for(int j=0 ; j<2 ; j++) 
					{
						System.out.print(" " + m2[i][j]);
					}
					System.out.println("");
				}
		//result
		System.out.println("m3=m2*m1 : ");
		for(int i=0 ; i<2 ; i++)
		{
			for(int j=0 ; j<2 ; j++)
			{
				int sum = 0 ;
				for(int k=0 ; k<3 ; k++)
				{
					sum = sum + m1[k][j]*m2[i][k] ;
				}
				m3[i][j]=sum ;
				System.out.print(" " + m3[i][j]) ;
			}
			System.out.println("");
		}
		
		// TODO Auto-generated method stub

	}

}
