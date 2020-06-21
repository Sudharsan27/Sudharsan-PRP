public class Arr1{
	public static void main(String args[]){
	  int[] arr=new int[args.length];
	  int sum=0;
	  int a=0;
	  int n=arr.length;
          for(int i=0;i<args.length;i++)
	   {
             arr[i]=Integer.parseInt(args[i]);
	   }
	  
	  for(int i=0;i<n;i++)
	    {
	      sum=sum+arr[i];
	      a=sum/n;
	     }
		System.out.println("Sum of an Array="+sum);
		System.out.println("Average of an Array="+a);
}
}
	  