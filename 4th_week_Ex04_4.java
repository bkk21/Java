import java.util.Scanner;
public class Ex04_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Amount: ");
		int sum = input.nextInt();
		
		int won50000 = sum / 50000;
		int won10000 = (sum % 50000) / 10000;
		int won5000 = ((sum % 50000) % 10000) / 5000;
		int won1000 = (((sum % 50000) % 10000) % 5000) / 1000;
		int won500 = ((((sum % 50000) % 10000) % 5000) % 1000) / 500;
		int won100 = (((((sum % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int won50 = ((((((sum % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int won10 = (((((((sum % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;

		System.out.println("50,000-won banknote: " + won50000);
		System.out.println("10,000-won banknote: " + won10000);
		System.out.println("5,000-won banknote: " + won5000);
		System.out.println("1,000-won banknote: " + won1000);
		System.out.println("500-won coin: " + won500);
		System.out.println("100-won coin: " + won100);
		System.out.println("50-won coin: " + won50);
		System.out.println("10-won coin: " + won10);
		
		input.close();
	}

}
