import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    //System.out.println("Hello World!");
    String n = sc.next();
     int zeros = 0;
	    String output = "";
		for(int i=0;i<n.length();i++){
			//System.out.println(n.charAt(i));
	      if(n.charAt(i) == '0') {
	    	  zeros++;
	      }else {
	    	  output += "1";
	      }
	    }
		
		for(int j=0; j<zeros;j++) {
			output += "0";
		}
		System.out.println(output);
  }
}