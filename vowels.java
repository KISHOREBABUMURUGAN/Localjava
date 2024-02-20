package classwork;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name : ");
str=sc.next().toLowerCase();

    char []ch=str.toCharArray();
     for (int i=0;i<=ch.length-1;i++){
    	 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
    		 System.out.print(" Removed vowels "+ ch[i]); 
    		
    	 }
    	
    	
     }
	
    
	}

}
