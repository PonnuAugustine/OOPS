package graphics;
import graphics.circle;
import graphics.rectangle;
import graphics.square;
import graphics.triangle;
import java.util.Scanner;

public class Area
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PONNU AUGUSTINE   23MCA044  15/04/24");
        int choice;
        circle obj1 = new circle();
        rectangle obj2 = new rectangle();
        square obj3 = new square();
        triangle obj4 = new triangle();
        do
        {
                System.out.println("Choose any    1)Circle   2)Rectangle   3)Square  4)Triangle 5)EXIT");
                choice = sc.nextInt();
                switch (choice) 
                {
                    case 1:
                        obj1.area();
                        break;
                    case 2:
                        obj2.area();
                        break;
                    case 3:
                        obj3.area();
                        break;
                    case 4:
                        obj4.area();
                        break;
                    case 5:
                        break;
                    default:
                        break;
                }
	}while(choice!=5);
    }
}
