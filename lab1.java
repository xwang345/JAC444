package test1;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		int value =input.nextInt();
		
		System.out.println("You have enter the value: " +value);
		System.out.println("Welcome to JAC444 Lab1");
	}
	

}


public class test1{
	public static void main(String[] args){
		double birthRateInSeconds = 7.0;
		double deathRateInSeconds = 13.0;
		double newImmigrantInSeconds = 45.0;
		
		double currentPopulation = 312032486;
		
		double secondsInYears = 60 * 60 * 24 * 365;
		
		double numBriths = secondsInYears / birthRateInSeconds;
		double numDeaths = secondsInYears/ deathRateInSeconds;
		double numImmigrants = secondsInYears / newImmigrantInSeconds;
		
		for(int i =1; i <=5; i++){
			currentPopulation += numBriths + numImmigrants - numDeaths;
			System.out.println("Year " + i + " the population is " + (int)currentPopulation);
		}
	}
}


