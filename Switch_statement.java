package wabtec_kit_session_corejavabasics;
import java.util.Scanner;
public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums;
Scanner sc=new Scanner(System.in);
nums=sc.nextInt();
switch(nums) {
case 1:
	System.out.println("sunday");
	break;
case 2:
	System.out.println("Monday");
case 3:
	System.out.println("Tuesday");
	break;
case 4:
	System.out.println("Wednsday");
case 5:
	System.out.println("Thursday");
case 6:
	System.out.println("friday");
case 7:
	System.out.println("saturday");
	default:
		System.out.println("Invalid days");
		}
	}
}
