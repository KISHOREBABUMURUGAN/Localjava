package capgeminibasicsjava;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a year  : ");
   year=sc.nextInt();
      if((year%4==0 && year%100!=0)|| (year%400==0) ) {
    	  System.out.println(year+" its a leap year");
      }
      else {
    	  System.out.println(year+" its not a leap year");
      }
     
	}

}
