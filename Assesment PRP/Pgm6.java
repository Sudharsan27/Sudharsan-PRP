public class Pgm6{
public static void main(String args[])
{
	if(args.length==0)
	    {
		System.out.println("No values");
	     }
	else
	   {
		int i=0;
		for(String n:args)
			{
			   System.out.print(n);
			      if(i<args.length-1)
				 System.out.print(",");
			  i++;
			}
	   }
}
}