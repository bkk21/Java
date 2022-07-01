import java.util.Scanner;

public class Ex05_3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1, y1 and r1: ");
		Double x1 = input.nextDouble();
		Double y1 = input.nextDouble();
		Double r1 = input.nextDouble();

		System.out.print("Enter x2, y2 and r2: "); 
		Double x2 = input.nextDouble();
		Double y2 = input.nextDouble();
		Double r2 = input.nextDouble();

		Double d = Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
		Double sum = r1 + r2;
		
		if(d <= sum)
			System.out.println("--> overlapped");
		
		else
			System.out.println("--> not overlapped");
	}

}
