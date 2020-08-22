package simplilearn.test;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;



public class assign2 {
	
	public static void main(String args[]) {
		 
	     System.out.println("============================================="); 
	     System.out.println("*                                           *"); 
	     System.out.println("*  Welcome To LockMe.com                    *"); 
	     System.out.println("*  Your Personal Digital Locker             *"); 
	     System.out.println("*                                           *"); 
	     System.out.println("=============================================");
	     System.out.println("1. Registration");
	     System.out.println("2. LogIn");

	     
	     Scanner in1 = new Scanner(System.in);

	        int a = in1.nextInt();
	        System.out.println("You entered choice: "+a);
	        
	        System.out.println("  "); 
	        
	        
            if  (a == 2) {
            	System.out.println("Enter your User Name: ");
       	        Scanner in2 = new Scanner(System.in);
       	        
       	        String name = in2.nextLine();
       	        System.out.println("  "); 
 	            System.out.println("You entered your user Name: "+name);
 	               
 	            	            
            	System.out.println("Enter your Password: ");
       	        Scanner in3 = new Scanner(System.in);
       	        
       	        String pwd = in3.nextLine();
       	        System.out.println("  "); 
 	            System.out.println("You entered your Password: "+pwd);
 	            String userID = name + pwd; 
 	            System.out.println("You entered your complex ID: "+userID);
 	            
 	           File file = new File("Demo1.txt");

 	          try {
 	              Scanner scanner = new Scanner(file);

 	              //now read the file line by line...
 	              int lineNum = 0;
 	              while (scanner.hasNextLine()) {
 	                  String line = scanner.nextLine();
 	                  lineNum++;
 	                 System.out.println("UserID:"+userID); 
 	                 System.out.println("line:"+line);
 	                  if(line.equals(userID)) { 
 	                      System.out.println("Congrats! Your log in is successful");
 	                      break;
 	                  } else {
 	                	 System.out.println("Sorry! You have not registered yet");
 	                  }
 	                  
 	              }
	            } catch (IOException e) {
 	            	System.out.println("An Error Occured");
 	            	e.printStackTrace();
 	          }
            }
            
            
            
	}
	
}
