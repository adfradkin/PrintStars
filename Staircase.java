public class Staircase
{	public static void main(String[] args)
	{
		DownUp(5);
		
		System.out.println("---------------");
	}
	
	public static void UpDown(int n)
	{
		int x = 0;
		while(x <= n)
		{
			x = 0; 
			for(int r = 0;r < n; r++)
			{
				System.out.print("*");
			}
			System.out.println();
			x++;
			n-= 1;
		}
	}
	public static void DownUp(int n)
	{
		for(int r = 0; r < n;r++)
		{
			for(int c = 0; c < n; c++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}		
	}
}