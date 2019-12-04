
import java.util.Scanner;

public class EvenOrOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input the intger number : ");
		int a = sc.nextInt();
		if (a%2==0) {
			System.out.println("the inputted number is Even ");
		}
		else {
			System.out.println("the inputted number is odd ");
		}
	}

}
