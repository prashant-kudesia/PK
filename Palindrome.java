package sample_program;
import java.util.*;
public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();

		int rem,reverse=0,temp;    
		temp=number;    
		while(number>0)
		{    
		   rem=number%10;   
		   reverse=(reverse*10)+rem;    
		   number=number/10;    
		}    
		if(temp==reverse)    
		{
			System.out.println(temp+" is a Palindrome number.");    
		}
    	else
    	{
			System.out.println(temp + " is not a Palindrome number");   
    	}
		sc.close();
	}
}	
