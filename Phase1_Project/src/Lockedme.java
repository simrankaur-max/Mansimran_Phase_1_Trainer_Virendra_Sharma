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
		
        
        System.out.println("***********************************************");
        System.out.println("******    DEVELOPED BY MANSIMRAN KAUR    ******");
        System.out.println("***********************************************");
        
        System.out.println("***  LOCKEDME.COM   ***");
        System.out.println("_______________________");
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
    		 
    	 String ad=sc.next();
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
    	
    	 try{
    		   File Mainpath= f.getCanonicalFile();
    		   String ad=sc.next().trim();
    		    File filepath = new File(Mainpath +"/"+ad);
    	        String[] list = Mainpath.list();
    	        for (String file: list) {
    	            if (ad.equals(file) && filepath.delete()) {
    	                System.out.println("File " + ad + " deleted from " + Mainpath);
    	                Sub_Menu();
    	            }
    	        }
    	        System.out.println("Delete Operation failed. FILE NOT FOUND");
    	        Sub_Menu();
         }
         catch(Exception e)
    	 {
    		 e.printStackTrace(); 
    	 }
     }
     void Search_File() {
    	 try {
    	 File Mainpath= f.getCanonicalFile();
    	 System.out.println("Please Enter File Name you want to Search:");
    	 String ad=sc.next().trim();
    	 File filepath = new File(Mainpath +"/"+ad);
    	 String[] list = Mainpath.list();
         for (String file: list) {
             if (ad.equals(file)) {
                 System.out.println("FOUND : File " + ad + " exists at " + Mainpath);
                 Sub_Menu();
             }
         }
         System.out.println("File NOT found ");
         Sub_Menu();
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace(); 
    	 }
     }
     void Exit() {
    	 System.out.println("Are you sure you want to exit yes or no");
    	 String output=sc.next();
    	 switch(output){    
         case "yes": System.out.println("Thankyou");  
                 System.exit(0); 
         case "no":  
                 Main_menu();
                 break;
         default: System.out.println("to confirm please press yes or no"); 
        Exit();       
     }
     }
}
