package classwork;
import java.util.Scanner;
public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a name : ");
	name =sc.next();
	
	char []ch=name.toCharArray();
	for(int i=name.length()-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
	
	
	}

}
