import java.util.*;
public class Question2
{
	public static void main(String[] args) {

		Scanner keyinput = new Scanner(System.in);
		System.out.println("\nPlease enter the required info below to calculate your BMI");

		System.out.println("How much do you weigh in pounds?");
		double weight = keyinput.nextDouble();

		System.out.println("How tall do you mesure in feet?");
		double height = keyinput.nextDouble();

		double kiloweight = weight / 2.205;
		double meterheight = height / 3.281;
		double totalBMI = kiloweight / Math.pow(meterheight,2);

		System.out.printf("Your total BMI is %.1f", totalBMI);


		if(totalBMI < 18.5){
			System.out.println("\nYou are underweight");
		} else if(totalBMI <= 25.9){
			System.out.println("\nYour are normal weight");
		} else if(totalBMI <= 29.9){
			System.out.println("\nYou are overweight");
		} else if(totalBMI <= 34.9){
			System.out.println("\nYou have class 1 obesity");
		} else if(totalBMI <= 39.9){
			System.out.println("\nYou have class 2 obesity");
		} else {
			System.out.println("\nYou have class 3 obesity");
		}
	}
}