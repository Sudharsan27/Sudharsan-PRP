public class Pgm20{
public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int rev=0,rem;
		int pa=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
	if(pa==rev)
		System.out.println(args[0]+" is a Palindrome");
	else
		System.out.println(args[0]+"is not a Palindrome");
	}
}