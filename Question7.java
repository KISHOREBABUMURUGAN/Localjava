package capgeminibasicsjava;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner (System.in);
         int month ;
         int year;
         System.out.println("Enter the month : ");
         month=sc.nextInt();
         System.out.println("Enter the year");
         year=sc.nextInt();
         
         
         switch(month)
         {
         case 1:
        	    System.out.println("This month has 31 days");
        	    break;
         case 2:
        	  if((year%4==0 && year%100!=0)|| year%400==0) {
        		  System.out.println("This month has 29 days");
        	  }
        	  else {
        		  System.out.println("This month has 28 days");
        	  }
        	  break;
         case 3:
        	  System.out.println("This month has 31 days");
        	  break;
         case 4:
       	  System.out.println("This month has 30 days");
       	  break;
         case 5:
       	  System.out.println("This month has 31 days");
       	  break;
         case 6:
       	  System.out.println("This month has 30 days");
       	  break;
         case 7:
       	  System.out.println("This month has 31 days");
       	  break;
         case 8:
       	  System.out.println("This month has 31 days");
       	  break;
         case 9:
       	  System.out.println("This month has 30 days");
       	  break;
         case 10:
       	  System.out.println("This month has 31 days");
       	  break;
         case 11:
       	  System.out.println("This month has 30 days");
       	  break;
         case 12:
         	  System.out.println("This month has 31 days");
         	  break;
        	 
         }
   

        	 
         
	}

}
