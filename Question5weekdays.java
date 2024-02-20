package capgeminibasicsjava;
import java.util.Scanner;
public class Question5weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the day number : ");
  days=sc.nextInt();
    
  switch(days) {
  case 1:
	  System.out.println("Its a Monday");
	  break;
  case 2:
	  System.out.println("Its a tuesday");
	  break;
  case 3:
	  System.out.println("Its a wednesday");
	  break;
  case 4:
	  System.out.println("Its a thursday");
	  break;
  case 5:
	  System.out.println("Its a friday");
	  break;
  case 6:
	  System.out.println("Its a saturday");
	  break;
  case 7:
	  System.out.println("Its a sunday");
	  break;
	  default:
		   break;
  
  }
      
	}

}
