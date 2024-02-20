package classwork;
import java.util.Scanner;
public class additionseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums;
Scanner s=new Scanner (System.in);
System.out.println("Enter the number : ");
   nums=s.nextInt();
   System.out.println("The enter the number is  : "+nums);
   int sum=0;
		   for(int i=0;i<=nums;i++) {
			   sum=sum+i;
		   }
		   System.out.println("The sum of the giver series of number : ");
		   System.out.println(sum); 
	}

}
