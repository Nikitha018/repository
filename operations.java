package cseproject;
import java.util.Scanner;
public class operations {
	public static void main(String[]args) { 
	Scanner sin=new Scanner(System.in);
	int a=sin.nextInt();
	int b=sin.nextInt();
	int c=a+b;
     System.out.println("addition:"+c);
     int e=a-b;
	System.out.println("sub"+e);
	int d=a*b;
	System.out.println("mul:"+d);
	int g=a%b;
	System.out.println("div:"+g);
 	}
}
