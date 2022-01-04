// Demo LinkedList. 
import java.util.*; 
import java.util.LinkedList;

class LinkedListDemo { 
	public static void main(String args[]) { 
		// create a linked list 
		LinkedList Nlist = new LinkedList();
		int nde ;
		Scanner sc = new Scanner(System.in);
		// add elements to the linked list 
		Nlist.addFirst("A");
		Nlist.add("B");
		Nlist.add("C");
		Nlist.add("D"); 
		Nlist.add("E");
		Nlist.add("F");
		Nlist.addLast("G");
		showList(Nlist);
		System.out.println("The First Node's Index numble : "+Nlist.getFirst());
		System.out.println("The End Node's Index numble : "+Nlist.getLast());
		System.out.println("Original contents of Nlist: " + Nlist); 
		System.out.println("You can Remove and New Data.");
		System.out.println("New Data?(input 1) or Delet Data(input 2)? or Exit(input 3)?");
		nde=sc.nextInt();
		while(nde!=3)
		{
			while(nde==1)
			{
				String s1;
				int v1;
				System.out.println("Input you want new data(String):");
				s1=sc.next();
				System.out.println("Input you new data's node:");
				v1=sc.nextInt();
				Nlist.add(v1, s1);
				showList(Nlist);
				System.out.println("New Data?(input 1) or Delet Data(input 2)? or Exit(input 3)?");
				nde=sc.nextInt();
			}
			if(nde==2)
			{
				String s2;
				int v2;
				// remove elements from the linked list
				System.out.println("Input you want delet Data(String):");
				s2=sc.next();
				Nlist.remove(s2);
				showList(Nlist);
				System.out.println("New Data?(input 1) or Delet Data(input 2)? or Exit(input 3)?");
				nde=sc.nextInt();
			}
		}
			System.out.println("====Exit====");
			System.exit(0);
	}
	public static void showList(LinkedList Nlist){
		System.out.println("LinkedList length :"+Nlist.size());
		System.out.println("LinkedList all show : ");
		for(int i=0;i<Nlist.size();i++)
		{
			System.out.print(Nlist.get(i));
			System.out.print(" ");
		}
		System.out.println("\n");
	}
}
