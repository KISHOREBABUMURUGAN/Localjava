package classwork;

import java.util.Scanner;

public class patternprinting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the limit : ");
		nums=sc.nextInt();
		  for(int i=1; i<=nums;i++)
		  {
		     for(int j=i;j<=nums
		    		 ;j++) {
		    	 System.out.print("*");
		     }
		  System.out.println();
		  }
	}

}
