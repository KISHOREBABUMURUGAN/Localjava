package String;
import java .util.Scanner;
public class removefunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the email id : ");
  name=sc.next();
  char ch[]=name.toCharArray();
  
       for(int i=0;i<=name.length()-1;i++) {
    	if(ch[i] != '@') 
    	{
    		System.out.print(ch[i]);
    	}
    	else
    	{
    		break;
    	}
       }
	}

}
