import java.util.Scanner;


public class ch05_im04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int s = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("input numble of students(Up to 50 people) ");
		int stu[]=new int [sc.nextInt()] ;
		//n = sc.nextInt();
		System.out.println("input student's score");
		
		for(int i = 0 ; i<=stu.length-1 ; i++)
		{
			System.out.println("the " + (i+1) + " student");
			stu[i] = sc.nextInt();
			//System.out.println(stu[i]);
		}
		System.out.println("=== Score distribution bar chart ===");
		int j ;
		for(j=10 ; j>=0 ; j--)
		{
			int y=10 ;
			int z=9 ;
			int count=0 ;
			if(j == 10)
			{
				//
				System.out.print("100 : ");
				for(int p : stu)
				{
					switch(p/100)
					{
					case 1 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			
			else if(j == 9)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 9 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 8)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 8 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 7)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 7 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 6)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 6 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 5)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 5 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 4)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 4 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 3)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 3 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 2)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 2 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 1)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 1 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
			else if(j == 0)
			{
				//
				System.out.print(j * y + "-" + (j * y + z) + " : ");
				for(int p : stu)
				{
					switch(p/10)
					{
					case 0 :
					count += 1 ;
					System.out.print("=");
					}
				}
				System.out.println("\n");
			}
		}
		
	}

}
