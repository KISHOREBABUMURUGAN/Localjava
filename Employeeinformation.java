package String;

public class Employeeinformation {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="Rakesh Raj@1pc16cs046-sde#8";
            String name;
            name =str.substring(0,str.indexOf("@"));
            System.out.println(name);

            String ssn;
            ssn=str.substring(str.indexOf("@")+1,str.indexOf("-") );
            System.out.println(ssn);
            
            String dept;
            dept=str.substring(str.indexOf("-")+1,str.indexOf("#"));
            System.out.println(dept);

            String nums;
            nums=str.substring(str.indexOf("#")+1);
            System.out.println(nums);

            
            
            
            System.out.println("The name of the employee is  : "+name);
            System.out.println("The ssn number is : "+ssn);
            System.out.println("The department is : "+dept);
            System.out.println("The salary is : "+nums);
         String s;
         s=str.substring(18,21);
        
         
         int num=Integer.parseInt(s);
         
         if(num>=001 && num<=060) {
        	 System.out.println("The ssn status is  L1");
         }
         else if(num>=061 &&num<=120) {
        	 System.out.println(" The ssn status is L2");
         }
         else if(num>=121 &&num<=180) {
        	 System.out.println("The ssn status is L3");
         }
         else if (num>=180) {
        	 System.out.println("The ssn status is L4");
         }
	}

}
