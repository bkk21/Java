package project1;
import java.util.Scanner;

public class Ex03_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double c, f;
		
		System.out.print("���� �µ��� �Է��ϼ���: ");
		c = input.nextDouble();
		
		f = ((float)9/(float)5) * c + 32;
		
		System.out.println("���� �µ� " + c + "�� ȭ�� �µ���" + f + " �Դϴ�.");

	}

}
