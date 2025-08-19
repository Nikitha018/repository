package cseproject;
import java.util.Scanner;
public class pattern {
public static void  main(String[]args) {
	Scanner sin=new Scanner(System.in);
	System.out.println("enter the numner");
	int n=sin.nextInt();
	int i,j;
	for(i=1;i<=n;i++) {
		//System.out.println();
	for(j=1;j<=i;j++) {
		System.out.print(" * ");
	}
	System.out.println("\n");
	}
  }
}
