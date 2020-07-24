/* PROJECT 2: INSTAGRAM GROWTH CALCULATOR*/
//Name: Ms. Meghana A


package intern;
import java.util.Scanner;

public class Instacalc 
{
	public static void main(String [] args)
	{
		// a-> no. of followers
		//b-> no. of unfollowers
		//c-> no. of posts
		//t-> time period
		System.out.println("Welcome to Instagram Growth Calclator");
		System.out.println("enter current number of followers(a):");
		Scanner sc1=new Scanner(System.in);		// to read input from user
		float a = sc1.nextFloat();
		
		System.out.println("enter number of unfollowers (b): ");
		Scanner sc2 = new Scanner(System.in);	// to read input from user	
		float b = sc2.nextFloat();
		
		System.out.println("Time period (t):");
		Scanner sc3 = new Scanner(System.in);	// to read input from user
		float t = sc3.nextFloat();
		
		System.out.println("Enter number of posts per month (c): ");
		Scanner sc4 = new Scanner(System.in);	// to read input from user
		int c = sc4.nextInt();
		
		System.out.println("Growth rate is: ");
		System.out.println(calcgr(t,a,b,c));
		
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		
	}

	public static double calcgr( float t, float a, float b, int c)
	{
		double T = 1/t;					// equating 1/t to T
		double A = b/a;					// A = unfollowers/followers
		double res = Math.pow(A,T);	
		double r = Math.abs((res-1)*100);
		return r;						// return result
	}
}

