package capgeminibasicsjava;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner (System.in);
  String c;
  System.out.println("Enter a letter : ");
  c=sc.nextLine().toLowerCase();
  
       if(c.equals("a")||c.equals("e")||c.equals("i")||c.equals("o")||c.equals("u")) {
    	   System.out.println("Input letter " + c +" is vowel");
       }
       else {
    	   System.out.println("Input letter " + c +" is consonant");
       }
	}

}
