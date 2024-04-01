import java.util.Arrays;
import java.util.Scanner;
public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PONNU AUGUSTINE");
	System.out.println("23MCA044");
	System.out.println("26/02/24");
	System.out.println("SortString");
        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();
        String[] strings = input.split("\\s+");
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}

