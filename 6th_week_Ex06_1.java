
public class Ex06_1 
{

	public static void main(String[] args) 
	{
		int[] x = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 55, 60, 99, 63, 80 };
		
		int max = x[0];
		for(int i=1; i<15; i++)
		{
			if(max < x[i])
				max = x[i];	
		}
		
		int min = x[0];
		for(int i=1; i<15; i++)
		{
			if(min > x[i])
				min = x[i];	
		}
		
		int sum = x[0];
		for(int i=1; i<15; i++)
		{
			sum += x[i]; 
		}
		
		double m = (double) sum / 15;
		
		double V = Math.pow((x[0]-m), 2);
		for(int i=1; i<15; i++)
		{
			V += Math.pow((x[i]-m), 2);
		}
		V = V / 15;
		
		double sigma = Math.sqrt(V);
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.printf("m = %.2f\n", m);
		System.out.println("V = " + V);
		System.out.printf("sigma = %.2f\n", sigma);
		
	}

}
