package capgeminibasicsjava;
import java.util.Scanner;
public class Question15displayodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
nums=sc.nextInt();
int sum=0;
      for(int i=1;i<=nums;i++) 
      	{
    	  if(i%2!=0)
    	  {
    		  System.out.println(i);
    		  sum=sum+i; 
    	
    	  }
    	    
    	    
      }
  	System.out.println(sum);
	}

}
