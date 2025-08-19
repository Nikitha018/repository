package cseproject;

import java.util.Scanner;
public class pattern2 {
	public static void  main(String[]args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter the numner");
		int n=sin.nextInt();
		int i,j;
		for(i=0;i<=n;i++) {
			//System.out.println();
		for(j=1;j<=n-i;j++) {
			System.out.print(" * ");
		}
		System.out.println("\n");
		}
	  }
	}
