
import java.util.Scanner;
public class calculator
{
	public static void main(String args[])
	{
	int num1,num2,add,sub,mul;
	float div;
	Scanner s=new Scanner(System.in);
	System.out.println("\nEnter the first number");
	num1=s.nextInt();
	System.out.println("\nEnter the second number");
	num2=s.nextInt();
	add=num1+num2;
	System.out.println("\nThe addition of 2 numbers are:"+add);
	sub=num1-num2;
	System.out.println("\nThe sutraction of 2 numbers are:"+sub);
	mul=num1*num2;
	System.out.println("\nThe multiplication of 2 nummbers are:"+mul);
	div=num1/num2;
	System.out.println("\nThe Division of 2 numbers are:"+div);
		
		
	}
	
	
	
}
