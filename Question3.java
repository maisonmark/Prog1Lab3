import java.util.*;

public class Question3{

	public static void main(String[] args){
	Scanner keyinput = new Scanner(System.in);

	double temp;
	String temp1= "";

	System.out.println("Please enter the temparature in degrees celcius");
	temp = keyinput.nextDouble();

	temp1 = (temp > 0 ) ? "It is hot" : "It is cold";

	System.out.println("\n" + temp1);


	}
}