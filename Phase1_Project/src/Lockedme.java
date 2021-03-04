import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Lockedme {
	File f=new File("C:\\Users\\Mansimran Kaur\\Documents");
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		 Lockedme lm = new  Lockedme();
		
        
        System.out.println("*****");
        System.out.println("DEVELOPED BY MANSIMRAN KAUR");
        System.out.println("*****");
        
        System.out.println("*  LOCKED ME. COM  **");
        System.out.println("*****");
        System.out.println("Directory: C:\\Users\\Mansimran Kaur\\Documents\n");
        lm.Main_menu();
       }
	public void Main_menu() {
		
		System.out.println("MAIN MENU--");
        System.out.println("Select any of the following:");
        
        System.out.println(" 1. Current file Names");
        System.out.println(" 2. Sub_Menu(Add,Delete,Search)");
        System.out.println(" 3. Exit");
        System.out.println("Enter Your Choice:");
        int num = sc.nextInt(); 
        
        switch(num){    
        case 1: System.out.println("Current File Name"); 
                CurrentFile_Name(); 
                break;  
        case 2: System.out.println("More");  
                Sub_Menu();
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
		 try{
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
		 }catch(Exception e)
		 {
			 e.printStackTrace();  
		 }
     }
	 
	 
	 void Sub_Menu()
     { 
  	   System.out.println("Select any of the Following");
       System.out.println(" 1. Add a File");
       System.out.println(" 2. Delete a file");
       System.out.println(" 3. Search a file");
       System.out.println(" 4. Go Back");
       System.out.println("Enter Your Choice:");
       int num = sc.nextInt(); 
       
       switch(num){    
       case 1: System.out.println("Adding a File"); 
              Add_File(); 
               break;  
       case 2: System.out.println("Deleting a File");  
               Delete_File();
               break;  
       case 3: System.out.println("Searching a File");  
               Search_File();
               break; 
       case 4: System.out.println("Go Back");  
               Main_menu();
               break; 
       
       default: System.out.println("Please select 1/2/3/4 option");  
                Sub_Menu();
       }
     }
	 
   	  
     void Add_File() {
    	 
    	 System.out.println("Please Enter File Name you want to add:");
    	 try {
    		 
    	 String ad=sc.next().toLowerCase().trim();
    	 String[] s=f.list();
    	 File file = new File("C:\\Users\\Mansimran Kaur\\Documents\\"+ ad);
    	 boolean result;   
    		 result = file.createNewFile(); 
    	 if(result)   
    	 {  
    	 System.out.println("file"+ ad+ " Added to : "+file.getCanonicalPath()); 
    	 }  
    	 else  
    	 {  
    	 System.out.println("File already exist at location: "+file.getCanonicalPath());  
    	 } 
    	  	 Sub_Menu();
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
     }
     void Delete_File()  {
    	 try {
    		 
    	 System.out.println("Please Enter File Name you want to Delete:");
    	 String ad=sc.next().toLowerCase().trim();
    	 //assertTrue(ad.toLowerCase().contains(dest.toLowerCase()));
    	 File file = new File("C:\\Users\\Mansimran Kaur\\Documents\\"+ ad);
    	 boolean result= f.exists(); 
    	 if(result==true) {
    		 System.out.println(file.delete());
    		 System.out.println("file"+ ad+ " Deleted from : "+file.getCanonicalPath()); 
    		 
    	 }
    	 else
    	 {
    		 System.out.println("File you want to delete is not Found"); 
    	 }
    	 Sub_Menu();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace(); 
    	 }
     }
     void Search_File() {
    	 try {
    		 
    	 System.out.println("Please Enter File Name you want to Search:");
    	 String ad=sc.next().toLowerCase().trim();
    	 File file = new File("C:\\Users\\Mansimran Kaur\\Documents\\"+ ad);
    	 boolean result= f.exists(); 
    	 if(result==true) {
    		 
         System.out.println("FOUND:"+file.getCanonicalPath()); 	 
    	 }
    	 else
    	 {
    		 System.out.println("File not Found"); 
    	 }
    	 Sub_Menu();
    	 }catch(Exception e)
    	 {
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