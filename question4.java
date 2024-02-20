package capgeminibasicsjava;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number : ");
      nums=sc.nextInt();
      
         if(nums>0) {
        	 if(nums<1) {
        		 System.out.println("positive small number");
        	 }
        	 else if(nums>1000000) {
        		 System.out.println("positive large number");
        	 }
        	 else {
        		 System.out.println("positive number");
        	 }
        	 
         }
         if(nums<0) {
        	 if(nums<1) {
        		 System.out.println("negative small number");
        	 }
        	 else if(nums>1000000) {
        		 System.out.println("negative large number");
        	 }
        	 else {
        		 System.out.println("negative number");
        	 }
        	 
         }
         else {
        	 System.out.println("Zero");
         }
         }
	}


