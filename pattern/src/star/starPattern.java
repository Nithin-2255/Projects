package star;

public class starPattern 
	{
	public static void main(String[] args) 
	{
		star(4);
	 }
	
	
	 static void star(int n)
	{
		for (int row=0;row<=2*n-1;row++)
		{
			int c= row > n ? 2*n-row:row;
			int space= n-c;
			for(int s=0;s<space;s++)
			{
				System.out.print(" ");
			}
			
			for(int col=row;col>=1;col--)
			{
				System.out.print(col);
				
			}
			for (int col=2;col>=c;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
	}
