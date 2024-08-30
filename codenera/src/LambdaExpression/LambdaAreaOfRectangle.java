package LambdaExpression;

import java.util.Scanner;

interface demo10
{
	public void disp();
}
public class LambdaAreaOfRectangle 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the width:");
		int a=sc.nextInt();
		System.out.println("enter the hight:");
		int b=sc.nextInt();
		
		demo10 ob=()->{
			System.out.println("Area of rectangle :"+(a*b));
		};
		ob.disp();
	}

}
