import java.util.LinkedList;
import java.util.Scanner;

public class HwLinkedList {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedList Nlist = new LinkedList();
		Nlist.add(10);
		Nlist.add(15);
		Nlist.add(25);
		Nlist.add(30);
		Nlist.add(35);
		showList(Nlist);
		System.out.println("The First Node's Index numble : "+Nlist.getFirst());
		System.out.println("The End Node's Index numble : "+Nlist.getLast());
		System.out.println("You can Remove and New Data.");
		System.out.println("Are you want New Data?(y/n)");
		String p = "0";
		int inn;
		if(p=="y")
		{
			System.out.println("Input numble.");
			inn=sc.nextInt();
			System.out.println(Nlist.add(inn));
			showList(Nlist);
		}
		else if(p=="n")
		{
			System.out.println("Are you want Delet Data?(y/n)");
			if(p=="y")
			{
				System.out.println("Input numble(you want).");
				inn=sc.nextInt();
				System.out.print(Nlist.removeFirstOccurrence(inn));
			}
			else
			{
				System.out.println("You can Exit.");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Please input y or n .");
		}
		
	}
	public static void showList(LinkedList Nlist){
		System.out.println("LinkedList length :"+Nlist.size());
		System.out.println("LinkedList all Node show : ");
		for(int i=0;i<Nlist.size();i++)
		{
			System.out.println(Nlist.get(i)+",");
		}
		System.out.println("\n");
	}

}
