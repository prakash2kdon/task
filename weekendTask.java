import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class weekendTask {

    public static void main(String []args)
    {
   	Scanner scv = new Scanner(System.in);
   	int v; 
   	System.out.println("Select your choice:\n 1. Print first 10 numbers \n 2. Loop-II \n 3. EndOfLife \n 4. Finding Primitive data types \n 5. Exception through for negative value \n 6. Change Number into String \n 7. Find currency value \n");
        v=scv.nextInt();
        
        switch(v)
        {
          case 1:
                 System.out.println("The value of the variable you selected is= "+v);
                 System.out.println("Enter Any number between the value 20 for complete this task!!!");
                 Scanner print=new Scanner(System.in);
           	 int n=print.nextInt();
                 //System.out.println("The number is:", n);
                 if(n<=2 || n<=20)
                 {
              	    for(int i=1; i<=10; i++)
                    {
                       System.out.println(n + " x "+i+" = "+i*n);
              	    }
                 }
                 else
                 {
                    System.out.println("The value is exist among the 20. If you want to continue please try again");
                 }
                 break;
          case 2:
                 System.out.println("The value of the variable you selected is= "+v);
                 System.out.println("Enter three value to a,b,n for complete this task!!!");
       		    Scanner in = new Scanner(System.in);
                    int a = in.nextInt();
	            int b = in.nextInt();
	            int num = in.nextInt();
        	    for (int j = 0; j < num; j++) 
            	    {
                       a += b * (int) Math.pow(2, j);
       	               System.out.print(a + " ");
             	    }
		    break;
          case 3:
                System.out.println("The value of the variable you selected is= "+v);
                System.out.println("Enter three words for complete this task!!!");
 		for(int k=1; k<=3; k++)
		{
                   Scanner sc = new Scanner(System.in);
                   String s=sc.nextLine();
	           System.out.println(k + " " + s);
                } 
                break;
          case 4:
                System.out.println("The value of the variable you selected is= "+v);
                System.out.println("Enter three words for complete this task!!!");
	        for(int i=0;i<3;i++)
        	{
	 	 Scanner sc = new Scanner(System.in);
	         int t=sc.nextInt();
            	   try
	           {
           	   	long x=sc.nextLong();
                	System.out.println(x+" can be fitted in: ");
	                if(x>=-128 && x<=127) {System.out.println("* byte");}
        	        if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
                	if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
	                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
          	    }
                    catch(Exception e)
	            {
        	        System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

       		 }
 		 break;
          case 5:
                   System.out.println("The value of the variable you selected is= "+v);
                   System.out.println("Enter the value for B & H to complete this task!!!");
		   int B,H;
	      	   Scanner sc = new Scanner(System.in);
	      	   B = sc.nextInt();
	           H = sc.nextInt();
	           if(B<=0 || H<=0)
		   {
	              System.out.println("java.lang.Exception: Breadth and height must be positive");
		   }
 		   else
		   {
            		int area=B*H;
			System.out.print(area);
		   }
                break;
          case 6:
                System.out.println("The value of the variable you selected is= "+v);
                System.out.println("Enter the number to be converted into string!!!");
                   Scanner str = new Scanner(System.in);
                   int n1 = str.nextInt();
		   String s2=Integer.toString(n1);  
		   if(n1>=-100 && n1<=100)
         	   {
                     if (n1 == Integer.parseInt(s2)) 
		     {
		       System.out.println("Good job");
		     }
		     else 
		     {
		       System.out.println("Wrong answer.");
  		     } 
		  } 
		  else 
		  { 
		     System.out.println("Please try again"); 
		  }
                break;