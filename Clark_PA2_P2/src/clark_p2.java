import java.util.Scanner;

public class clark_p2 {

	public static void main(String args[]){
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Would you like to use metric or imperial? ( 1 for metric 2 for imperial): ");
		int choice = scnr.nextInt();
		
		//Using metric for choice 1;
		if (choice == 1) {
			
			System.out.println("Enter weight in kilograms: ");
			double kiloWeight = scnr.nextDouble();
			System.out.println("Enter height in meters: ");
			double heightMeters = scnr.nextDouble();
			//int heightCent = heightMeters / 100;
				
			//System.out.println("")
			double bmiMetric = (kiloWeight) / (Math.pow(heightMeters, 2));
			
			System.out.printf("Your BMI is %.1f", bmiMetric);
			
			//Need to add the BMI Categories 
			System.out.println("");
			System.out.println("BMI Categories: ");
			System.out.println("Underweight = <18.25");
			System.out.println("Normal weight = 18.25 - 24.9");
			System.out.println("Overeight = 25 - 29.9");
			System.out.println("Obesity = BMI of 30 or greater");

			
		}
		else if (choice == 2) {
			
			System.out.println("Enter weight in pounds: ");
			double weightPounds = scnr.nextDouble();
			System.out.println("Enter height in inches: ");
			double heightInches = scnr.nextDouble();
			
			double bmiImperial = (703 * weightPounds) / (Math.pow(heightInches, 2));
			
			//answer
			System.out.printf("Your BMI is %.1f", bmiImperial);
			//printing out bmi categories
			System.out.println("");
			System.out.println("BMI Categories: ");
			System.out.println("Underweight = <18.25");
			System.out.println("Normal weight = 18.25 - 24.9");
			System.out.println("Overeight = 25 - 29.9");
			System.out.println("Obesity = BMI of 30 or greater");

		}

		scnr.close();
		
	}
	
	
}