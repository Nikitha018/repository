package cseproject;

import java.util.Scanner;
public class sumofdigits {
	public static void main(String[]arg) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the numner");
	int num=sin.nextInt();
	int sum=0;
	while(num!=0) {
		int digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	System.out.println("enter the:"+num+"sum:"+sum);
}
}
