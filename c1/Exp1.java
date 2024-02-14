public class Exp1
{
	public static void main(String[] args)
	{
		System.out.println("PONNU AUGUSTINE");
		System.out.println("23MCA044");
		System.out.println("13/02/24");
		System.out.println("Product");
		Product p1=new Product();
		p1.pcode="Car123";
		p1.pname="Maruti";
		p1.price=50000;
		System.out.println(".................Displaying p1..................");
		p1.display();
		
		Product p2=new Product("Benz","Car456",90000);
		System.out.println("...............Displaying p2................");
		p2.display();
		
		Product p3=new Product("Jaguar","Car789",80000);
		System.out.println("...............Displaying p3................");
		p3.display();
		
		Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p1);
		System.out.println("\n.....Displaying product with lowest price.....");
		p.display();
	}
}
