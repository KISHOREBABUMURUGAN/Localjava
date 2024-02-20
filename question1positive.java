package capgeminibasicsjava;
import java.util.Scanner;
public class question1positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number :");
nums=sc.nextInt();


if(nums>0) {
	
	System.out.println("It is a positive number : "+nums);
}
else {
	
	System.out.println("It is a negative number : "+nums);
}
	}

}
