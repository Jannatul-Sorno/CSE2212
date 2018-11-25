package main;

import java.util.Scanner;

public class JavaQuiZTest {

	public static void main(String[] args) {
		int input;
		int Sum = 100;
		int[] Buyers = new int[100];
		final int ticket = 4;
		Scanner in = new Scanner(System.in);
		int x,y,count = 0;
		for(int i = 0; i<100; i++)
		{
		  Buyers[i]=0;
		}
		for(int i = 0;Sum>=0; i++) {
			System.out.println("Position of Buyers: Quantity of ticket: ");
			x = in.nextInt();
			y = in.nextInt();
			if(y<ticket && Buyers[x]+y <=4) {
				
				Buyers[x]+=y;
				Sum -= y;
				System.out.println("Buyer is : " + x +"Total Remaining Tickets: " + Sum);
				
			}
			else {
				System.out.println("Buyer exit the budget:");
			}
		}
		for(int i = 0; i<100; i++) {
			if(Buyers[i]!=0) {
				count++;
			}
		}
       System.out.println("Total Buyer: " + count);
	}
}
	


