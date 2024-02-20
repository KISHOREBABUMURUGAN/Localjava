package classwork;
import java.util.Scanner;

public class multiplytableadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int  y, sum=0;  
		  
		System.out.print("Enter the table number: ");  
		y=sc.nextInt();  
		//executes until the condition becomes false  
		for(int i=1;i<=10;i++)  
		{  
		//calculates the sum  
		sum=sum+y;  
		
		System.out.println(" "+i+" x "+y+" = "+sum+"");
	
		}  
		 
		//System.out.println(sum);
		
		
	}

}
