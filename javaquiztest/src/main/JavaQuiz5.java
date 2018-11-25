package main;

import java.util.Scanner;

public class JavaQuiz5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = 3;
		int T = 60;
		int t = 0;
		int v[] = {1,10,20,40};
		System.out.println("Enter any mass: ");
		int m = in.nextInt();
		int F = 0;
		for(int i=0;i<4;i++) {
			if(t>T) {
				break;
			}
			else {
				F = t;
				t = m*(v[i]*v[i])/r;
			}
		}

     System.out.println("Answer is : " + F);

}
}