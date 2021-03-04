package jav.login.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sub_menu extends Main_menu  {
	Scanner sc=new Scanner(System.in);
	File f=new File("C:\\Users\\Mansimran Kaur\\Documents");
	public void Sub_menu()
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
               Sub_menu();
      }
    }
	void Add_File() {
		try {
   	 System.out.println("Please Enter File Name you want to add:");
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
   	  	 Sub_menu();
   	  	 }
   		catch(Exception e)
   		{
   		 e.printStackTrace();
   		}
    }
    void Delete_File(){
   	 try 
   	 {
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
   	 Sub_menu();
   	 }
   	 catch (Exception e)
   	 {
   		 e.printStackTrace(); 
   	 }
    }
    void Search_File()  {
   	 try 
   	 {
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
   	 Sub_menu();
   	 }catch (Exception e)
   	 {
   		 e.printStackTrace();
   	 }
    }
   
}


