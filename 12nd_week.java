import java.util.Scanner;

public class week12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double D = Math.pow(b, 2) - 4 * a * c;
		
		if(D < 0)
			System.out.println("No answer");
		
		else if(D > 0)
		{
			double x1 = (-b + Math.sqrt(D)) / (2 * a);
			double x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("x1=" + x1 + ", x2=" + x2);
		}
		
		else
			System.out.println("x=" + -b / (2 * a));
	}

}
