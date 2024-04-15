import java.util.*;
public class Linked
{
	public static void main(String[] args)
	{
		System.out.println("PONNU AUGUSTINE   23MCA044  15/04/24");
		System.out.println();
		LinkedList<String> L=new LinkedList<>();
		L.add("Gold");
		L.add("Silver");
		L.add("Bronze");
		L.add(0,"Olympics Medals");
		System.out.println(L);
		L.remove("Bronze");
		System.out.println(L);
		L.remove(2);
		System.out.println(L);
		L.removeLast();
		System.out.println(L);
		L.removeFirst();
		System.out.println(L);
	}
}
