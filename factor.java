package capgeminibasicsjava;
import java.util.Scanner;
public class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int nums;
Scanner sc=new Scanner (System.in);
System.out.println("Enter a number : ");
nums=sc.nextInt();

  for(int i=1; i<=nums;i++) {
	  if(nums%i==0) {
		  System.out.println("factor of a number : "+i);
	  }
	 
  }
	}

}
