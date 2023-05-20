/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int age;
	    int gender;
	    Scanner sc= new Scanner(System.in);
		System.out.println("enter age");
	    age=sc.nextInt();
	    if(age>60){
	        System.out.println("senior citizen");
	    }else{
	        System.out.println("Not senior citizen");
	    }
	     System.out.println("enter gender 1 for male and 0 for female");
	     gender=sc.nextInt();
        if(gender==0 && age>60)
        {
            System.out.println("this is musali aunty");
        }  
        if(gender==1 && age>60)
        {
            System.out.println("musali uncle");
        }
	}
}
