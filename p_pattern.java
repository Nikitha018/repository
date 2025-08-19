package cseproject;

public class p_pattern {
	public static void main(String[]args) {
		int i,j;
		int height=9;
		int width=7;
		for( i=0;i<=height;i++) {
			for( j=0;j<width;j++) {
				if(j==0) {
					System.out.print("*");
			  }
			else if((i==0||i==height/2)&&j<width-1) {
				System.out.print("*");
			}
			else if(j==width-1 && i>0 && i<height/2){
					System.out.print("*");
			}
			else {
			System.out.print(" ");
		}
		System.out.println();
	 }
  }
 }
}