package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Input the amount of money you would like to gamble");
		int startAmount = in.nextInt();
		
		System.out.println("Input the chance of winning");
		double winChance = in.nextDouble();
		
		System.out.println("Input your win limit");
		int winLimit = in.nextInt();
		
		System.out.println("Input number of days you would like to play");
		int totalSimulations = in.nextInt();
		
		int balance = startAmount;
		int i = 1;
		int simTimes = 0;
		
		
		
		
		
		while (i <= totalSimulations) {
			System.out.print("Day number " + i + ": ");
		
		while (balance < winLimit && balance > 0)
			simTimes = simTimes+1;
			{
			if (Math.random() < winChance)
			{
				balance = balance + 1;
			}
			else {
				balance = balance-1;
			}
			
			
			
			}
		
		if (balance == (winLimit))
		{
		System.out.println("success");
		i = i+1;
		
		balance = startAmount;
		}
		
		if (balance == (0))
		{
		System.out.println("ruin");
		i = i+1;
		balance = startAmount;
		}
		System.out.println("");
		System.out.println("Gambles per day: " + simTimes);
		simTimes = 0;
		
		}
		
		
		
		
		
		
		
		
	}

}
