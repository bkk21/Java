
public class Ex07_1 
{
	public static void main(String[] args)
	{
		int[][] input = 
		{
				{1,0,1,0,1,1,1,1},
				{1,0,0,0,0,0,1,1},
				{0,1,0,0,0,0,0,0},
				{1,1,1,1,0,0,0,0},
				{1,0,1,1,1,0,0,1},
				{0,0,0,0,0,1,1,1},
				{1,1,1,1,1,1,1,1},
				{0,1,1,1,1,0,0,0}
		};
		
		int parity [] = new int[input.length];
		
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input[i].length; j++)
				System.out.printf("%d ", input[i][j]);
			
			System.out.printf("%d\n", Paraty1(input[i]));
			parity[i]=Paraty1(input[i]);
		}
		
		for(int i = 0; i < input[0].length; i++)
			System.out.printf("%d ", Paraty2(input, i));
		
		System.out.printf("%d ",Paraty1(parity));
		}
	
	public static int Paraty1(int arr[])
	{
		int sum = 0;
		for (int d : arr) 
			sum += d;
		
		return sum % 2 == 0 ? 0 : 1;
	}
	
	public static int Paraty2(int arr[][], int i)
	{
		int sum = 0;
		for (int j = 0; j < arr.length; j++)
			sum += arr[j][i];
		
		return sum % 2 == 0 ? 0 : 1;
	}

}