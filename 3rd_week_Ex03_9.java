package project1;
import java.util.Scanner;

public class Ex03_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double c, f;
		
		System.out.print("¼·¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä: ");
		c = input.nextDouble();
		
		f = ((float)9/(float)5) * c + 32;
		
		System.out.println("¼·¾¾ ¿Âµµ " + c + "ÀÇ È­¾¾ ¿Âµµ´Â" + f + " ÀÔ´Ï´Ù.");

	}

}
