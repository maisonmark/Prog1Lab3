import java.util.*;

public class Question1{

	public static void main(String[] args){
	Scanner keyinput = new Scanner(System.in);

	System.out.println("\nPlease enter the radius to your circle, in order to calculate the area ");
	double radius = keyinput.nextDouble();
	
	while(radius <= 0){
		System.out.println("\nThis is not a positive number greater than 0");
		System.out.println("\nPlease re-enter a positive number greater than 0:");
		radius = keyinput.nextDouble();
	}

	double area = Math.PI * (radius * radius);

	System.out.printf("\n The area of your circle is %.2f", area);


	}
}