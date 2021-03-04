package jav.login.com;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class  Main_menu {
	File f=new File("C:\\Users\\Mansimran Kaur\\Documents");
	Scanner sc = new Scanner(System.in);
	public void Main_menu() {
	
	System.out.println("MENU--");
    System.out.println("Select any of the following:");
    
    System.out.println(" 1. Current file Names");
    System.out.println(" 2. Sub_Menu(Add,Delete,Search)");
    System.out.println(" 3. Exit");
    System.out.println("Enter Your Choice:");
    int num = sc.nextInt(); 
    Sub_menu sm=new Sub_menu();
    
    switch(num){    
    case 1: System.out.println("Current File Name"); 
           CurrentFile_Name(); 
            break;  
    case 2: System.out.println("More");  
            sm.Sub_menu();
            break;
    case 3: System.out.println("Exit");  
            Exit();
    break;
    default: System.out.println("Please select 1,2 or 3 option");  
             Main_menu();
    }
}
	 public void CurrentFile_Name()
     { 
  	   try {
		 String[] s=f.list();

	        if (s==null)
	            System.out.println("No files in the directory");
	        else {
	            System.out.println("The files in "+ f.getCanonicalPath() +" are :\n");
	            Arrays.sort(s);
		         for(String s1:s)
		              {
			             System.out.println(s1); 
		               }
	             }
  	  Main_menu();
  	   }catch(Exception e) {
  		 e.printStackTrace();
  	   }
     }
	 void Exit() {
    	 System.out.println("Are you sure you want to exit yes or no");
    	 String output=sc.next();
    	 switch(output){    
         case "yes": System.out.println("Thankyou");  
                 break;  
         case "no":  
                 Main_menu();
                 break;
         default: System.out.println("to confirm please press yes or no"); 
        Exit();       
     }
}
}