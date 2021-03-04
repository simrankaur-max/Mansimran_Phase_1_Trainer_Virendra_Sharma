package jav.login.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project1 {

	File f=new File("C:\\Users\\Mansimran Kaur\\Documents");
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Main_menu obj = new Main_menu();
		
        
        System.out.println("***********");
        System.out.println("DEVELOPED BY MANSIMRAN KAUR");
        System.out.println("***********");
        
        System.out.println("***  LOCKED ME. COM  ****");
        System.out.println("***********");
        System.out.println("Directory: C:\\Users\\Mansimran Kaur\\Documents\n");
        obj.Main_menu();
       }

}
