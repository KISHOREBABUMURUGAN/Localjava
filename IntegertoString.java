package String;

import java.util.Arrays;

public class IntegertoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;

String b=Integer.toString(a);


System.out.println(b);
System.out.println(b.charAt(0));

String c= Integer.toString(a);
 String replace=c.replace('1', 'h');
 System.out.println(replace);
 String d="kishore";
String f= d.replace("kishore", "babu");
System.out.println(f);


String y="nagu";
   String x=y.replace("n", "x" );
	   
   System.out.println(x);
   
   String str="12345";     //String to integer
   int z=Integer.parseInt(str);
   System.out.println(z);
   System.out.println();
   
   String str1=String.valueOf(z);
   System.out.println(str1);  //integertostring
   
 int []nu= {1,2,3,34};
 String ans=Arrays.toString(nu);
 System.out.println(ans);
	}

}
