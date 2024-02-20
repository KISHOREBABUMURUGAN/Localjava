package capgeminibasicsjava;
import java.util.Scanner;
public class question11firstnnaturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int nums;
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number : ");
   nums=sc.nextInt();
   
   
          int sum=0;
          System.out.println("The natural numbers are : "
          		+ "");
          for(int i=1;i<=nums;i++) {
        	      sum=sum+i;
        	      System.out.println(i);
          }
          System.out.println("The sum of "+nums+" natural numbers : "+sum);
   
	}

}
