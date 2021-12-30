
public class Program7 {

	public static void main(String[] args) {
		int a[] = new int [30];
		for( int i = 1; i <= 30; i++)
		{
			int c = 0;
			for(int j = 2; j <= i; j++)
			{	
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==1)
			{ 
				a[i]=i;
				System.out.println("Prime numbers is: " + a[i]);
				System.out.println("Square of " + i + " is: " + a[i]*a[i]);
				System.out.println("Cube of " + i + " is: " + a[i]*a[i]*a[i]);
				System.out.println("\n");
			}
         }
}
}	
