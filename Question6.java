package capgeminibasicsjava;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first floating number : ");
     double f1;
     f1=sc.nextDouble();
     System.out.println("Enter the Second floating number : ");
     double f2;
     f2=sc.nextDouble();
     
       if(f1==f2) {
    	    System.out.println("They are the same up to three decimal places");
       }
       else {
    	   System.out.println("They are different");
       }
     
	}

}
