/*
4. Accept one character from user and convert case of that character.
Input : a Output : A
Input : D Output : d 
*/

import java.lang.*;
import java.util.*;

class Change
{
	public void ChangeCase(char ch)
	{
		if((ch>='a') && (ch<='z'))
		{
			int temp;
			
			temp=(int)ch;
			temp=temp-32;
			ch=(char)temp;
			
			System.out.println("Charector after change is :"+ch);
		}
		else if((ch>='A') && (ch<='Z'))
		{  
	         int temp;
			
			temp=(int)ch;
			temp=temp+32;
			ch=(char)temp;
			
			System.out.println("Charector after change is :"+ch);
		}
	}
}


class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Charector\n");
		char ch=sobj.next().charAt(0);
		
		Change cobj=new Change();
		cobj.ChangeCase(ch);
		
	}
}