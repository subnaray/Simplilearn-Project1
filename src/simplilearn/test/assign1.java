package simplilearn.test;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;



public class assign1 {
	
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
	        
	        
            if  (a == 1) {
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
 	            
 	            File fileObj = new File("Demo1.txt");
 	            try {
 	            	if(fileObj.exists()) {
 	            		FileWriter fileWriter = new	FileWriter(fileObj);
 	            		name = name + "\n";
 	              		fileWriter.write(name);

 	              		pwd = pwd + "\n";             		
 	                    fileWriter.write(pwd);
 	                    
 	                    fileWriter.close();
 	            		System.out.println("Record has entered");

 	            	}	else {
 	            		 	fileObj.createNewFile();
 	                		FileWriter fileWriter = new	FileWriter(fileObj);
 	                		
 	                		name = name + "\n";
 	 	              		fileWriter.write(name);
 	 	              		
 	 	              	    pwd = pwd + "\n"; 
 	 	                    fileWriter.write(pwd);
 	                		fileWriter.close();
 	                		System.out.println("1 Record has entered in new file");               		
	            	            	
 	            		
 	            	}
 	            	
 	            	
 	            		
 	            } catch (IOException e) {
 	            	System.out.println("An Error Occured");
 	            	e.printStackTrace();
 	            	
 	            	
 	            }
            
            }
            
            
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
// 	            String userID = name + pwd; 
// 	            System.out.println("You entered your complex ID: "+userID);
 	            
 	           File file = new File("Demo1.txt");

 	          try {
 	              Scanner scanner = new Scanner(file);

 	              //now read the file line by line...
 	              int lineNum = 0;
 	              int nxtlineNum = 1;
 	              int mtchFnd = 0;
 	              
 	              while (scanner.hasNextLine()) {
 	                  String line = scanner.nextLine();
 	                  lineNum++;
	                  String nxtline = scanner.nextLine();
	                  nxtlineNum++;

   	                  if(line.equals(name) && nxtline.equals(pwd)) { 
   	                	 
   	                	  mtchFnd = 1;
 	                	  System.out.println("Congrats! Your log in is successful");
 	                      break;
 	                    
 	                  } 
//   	                  else {
// 	                	 System.out.println("Sorry! You have not registered yet");
// 	                  }
 	                  
 	              }
 	              if (mtchFnd == 0) {
 	            	 System.out.println("Sorry! You have not registered yet");
 	              }
	            } catch (IOException e) {
 	            	System.out.println("An Error Occured");
 	            	e.printStackTrace();
 	          }
 	         otherOption();
            }
            

	}
	
    public static void otherOption() {
    	
    	System.out.println("  ");
    	System.out.println("=============================================");
    	System.out.println("*                                           *");
    	System.out.println("*      Welcome to Digital Locker            *");
    	System.out.println("*        Store your cred here               *");
    	System.out.println("*                                           *");
    	System.out.println("=============================================");
    	   
    	 System.out.println("1. Store New Credential");
	     System.out.println("2. Fetch Stored Credential");
	     
	     Scanner inp = new Scanner(System.in);

	        int b = inp.nextInt();
	        System.out.println("This time You have entered choice: "+b);
	        
	        System.out.println("  "); 
	        
	        if  (b == 1) {
	        	storedNewcred();
	        	
	        }
	        if (b==2) {
          	takeInfo();
	        }
    }
    
    public static void storedNewcred() {
    	
    	System.out.println("Enter the site name which one you want to store in LOCKME: ");    
    	    Scanner inp1 = new Scanner(System.in);
            String inpsite = inp1.nextLine();
            System.out.println("  "); 
        
    	System.out.println("Enter your User Name which one you want to store in LOCKME: ");
	        Scanner inp2 = new Scanner(System.in);
	        String inpname = inp2.nextLine();
	        System.out.println("  "); 
	        
            
    	System.out.println("Enter your Password which one you want to store in LOCKME: ");
	        Scanner inp3 = new Scanner(System.in);
	        String inpwd = inp3.nextLine();
	        System.out.println("  "); 
	        
	        regNewcred(inpsite,inpname,inpwd);

    }
    
    public static void regNewcred(String site,String nm,String pswrd) {
    	File fileObj = new File("Demo2.txt");
         try {
         	if(fileObj.exists()) {
         		FileWriter fileWriter = new	FileWriter(fileObj);
         		
         		site = site + "\n";
           		fileWriter.write(site);
           		
         		nm = nm + "\n";
           		fileWriter.write(nm);

           		pswrd = pswrd + "\n";
                fileWriter.write(pswrd);
                
                fileWriter.close();
                 
         		System.out.println("LockMe Record has entered Successfully");

         	}	else {
         		 	fileObj.createNewFile();
             		FileWriter fileWriter = new	FileWriter(fileObj);
             		
             		    site = site + "\n";
             		    fileWriter.write(site);
             		    
             		    nm = nm + "\n";
	              		fileWriter.write(nm);
	              		
	              		pswrd = pswrd + "\n";
	                    fileWriter.write(pswrd);
             		fileWriter.close();
             		System.out.println("1 Record has entered in new Lock Me file");
        		
        	            	
         		
         	}
         	
         	
         		
         } catch (IOException e) {
         	System.out.println("An Error Occured for LockMe");
         	e.printStackTrace();
         	
         	
         }
         
         }
 
      public static void takeInfo()   {
     System.out.println("Enter the site name for which one you want to retrieve password from LOCKME: ");    
	    Scanner inpt1 = new Scanner(System.in);
        String inptsite = inpt1.nextLine();
        System.out.println("  "); 
    
	System.out.println("Enter your User Name for which one you want to retrieve password from LOCKME: ");
        Scanner inpt2 = new Scanner(System.in);
        String inptname = inpt2.nextLine();
        System.out.println("  "); 
        
        
//	System.out.println("Enter your Password which one you want to retrieve from LOCKME: ");
//        Scanner inpt3 = new Scanner(System.in);
//        String inptwd = inpt3.nextLine();
        System.out.println("  "); 
    	  
//       System.out.println("Entered site name: "+inptsite); 
//       System.out.println("Entered user name: "+inptname); 
//       System.out.println("Entered user name: "+inptwd); 
        fetchPswrd(inptsite,inptname);
      }
      public static void fetchPswrd(String site,String nm) {
           File file = new File("Demo2.txt");

          try {
              Scanner scanner = new Scanner(file);

              //now read the file line by line...
              int lineNum = 0;
              int nxtlineNum = 1;
              int nxt2lineNum = 2;
              int mtchFnd = 0;
              
              while (scanner.hasNextLine()) {
            	  
                 String line = scanner.nextLine();                  
                 lineNum++;
                 
                 String nxtline = scanner.nextLine();
                 nxtlineNum++;
                 
                 String nxt2line = scanner.nextLine();
                 nxt2lineNum++;
                 
                 

	                  if(line.equals(site) && nxtline.equals(nm)) { 
	                	 
	                	  
                	  System.out.println("Congrats! We found your Passwoprd");
                	  System.out.println("Your Passwor for site "+site+" and usaer name "+nm+" is "+nxt2line);
                	  mtchFnd = 1;
                      break;
                  } 
//	                  else {
//                	 System.out.println("Sorry! we did not found any match");
//                   }
                  
              }
              if (mtchFnd == 0) {
            	  System.out.println("Sorry! we did not found any match"); 
              }
           } catch (IOException e) {
            	System.out.println("An Error Occured");
            	e.printStackTrace();
          }    	  
    	  
      }
}

