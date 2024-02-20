package capgeminibasicsjava;
import java.util.Scanner;
public class Question13cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
nums=sc.nextInt();
int result;
   for(int i=1;i<=nums;i++) {
	   result=i*i*i;
	   System.out.println(" The number is "+i+" and cube of "+i+ " is "+result);
   }
   
	}

}
