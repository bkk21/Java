import java.util.Random;
public class Ex09_2 {

	public static void main(String[] args) 
	{
		Random random = new Random();
		
		int score [] = new int[300];
		int sum = 0;
		double Average = 0.0;
		int printscore [] = new int[11];
		
		
		for(int i=0; i<score.length; i++)
		{
			score[i] = random.nextInt(101);
			sum += score[i];
			
			if(score[i] == 100)
				printscore[0] += 1;
			else if(90 <= score[i] && score[i] <= 99)
				printscore[1] += 1;
			else if(80 <= score[i] && score[i] <= 89)
				printscore[2] += 1;
			else if(70 <= score[i] && score[i] <= 79)
				printscore[3] += 1;
			else if(60 <= score[i] && score[i] <= 69)
				printscore[4] += 1;
			else if(50 <= score[i] && score[i] <= 59)
				printscore[5] += 1;
			else if(40 <= score[i] && score[i] <= 49)
				printscore[6] += 1;
			else if(30 <= score[i] && score[i] <= 39)
				printscore[7] += 1;
			else if(20 <= score[i] && score[i] <= 29)
				printscore[8] += 1;
			else if(10 <= score[i] && score[i] <= 19)
				printscore[9] += 1;
			else if(0 <= score[i] && score[i] <= 9)
				printscore[10] += 1;
		}
		
		Average = (double) sum / 50.0 ;
		
		System.out.print("score[]: ");
		for(int i=0; i<score.length; i++)
		{
			System.out.printf("%d ", score[i]);
		}
		
		System.out.println();
		System.out.println("Average: " + Average);
		
		
			System.out.printf("  100: %2d ", printscore[0]);
			for(int j=0; j < printscore[0]; j++)
				System.out.print("*");
			System.out.println();
			
			System.out.printf("99-90: %2d ", printscore[1]);
			for(int j=0; j < printscore[1]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("89-80: %2d ", printscore[2]);
			for(int j=0; j < printscore[2]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("79-70: %2d ", printscore[3]);
			for(int j=0; j < printscore[3]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("69-60: %2d ", printscore[4]);
			for(int j=0; j < printscore[4]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("59-50: %2d ", printscore[5]);
			for(int j=0; j < printscore[5]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("49-40: %2d ", printscore[6]);
			for(int j=0; j < printscore[6]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("39-30: %2d ", printscore[7]);
			for(int j=0; j < printscore[7]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("29-20: %2d ", printscore[8]);
			for(int j=0; j < printscore[8]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("19-10: %2d ", printscore[9]);
			for(int j=0; j < printscore[9]; j++)
				System.out.print("*");
			System.out.println();

			System.out.printf("09-00: %2d ", printscore[10]);
			for(int j=0; j < printscore[10]; j++)
				System.out.print("*");
			System.out.println();
		
	}

}
