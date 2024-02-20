package constructorchain;

public class constructor1 {
     constructor1() {
    	System.out.println("I am a default constructor1");
    }
      constructor1(int a) {
    	  this();
    	System.out.println("12345");
    }
      constructor1(String a){
    	  this(20);
    	  System.out.println("kishore");
      }
}
