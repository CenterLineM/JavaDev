import java.util.Scanner;
public class ch05_im02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int matrix[][] ;
		System.out.print("input the dimensions of the Row matrix => ");
		int r = sc.nextInt();
		System.out.print("input the dimensions of the Column matrix => ");
		int c = sc.nextInt();
		matrix=new int [r][c] ;
		
		for(int i = 0 ; i<=r-1 ; i++)
		{
			for(int j = 0 ; j<=c-1 ; j++)
			{
				System.out.print("A["+i+"]"+"["+j+"]==>" );
				matrix[i][j] = sc.nextInt() ;
				//System.out.println();
			}
		}
		
		System.out.println("Original matrix");
		for (int i = 0; i <= r-1; i++) 
		{
            for (int j = 0; j <= c-1; j ++) 
            {
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
		}
		System.out.println("Transpose matrix");
		for (int i = 0; i <= c-1; i++) 
		{
            for (int j = 0; j <= r-1; j ++) 
            {
                    System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
		}

	}

}
