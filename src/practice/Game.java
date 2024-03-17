package practice;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ticket number : ");
		int ticket = sc.nextInt();
		int tokenEarn = 0;
		for(int i=1; i<=ticket;i++) {
			System.out.println("User play "+i+" game ");
			tokenEarn+=25;
			
			if(tokenEarn==100) {
				System.out.println("Token earn "+tokenEarn);
				ticket++;
				System.out.println("Buy ticket ....");
				tokenEarn = 0;
				
			}
		}
		System.out.println("Total ticket are "+ticket);
	}

}
