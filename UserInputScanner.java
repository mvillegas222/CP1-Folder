
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your full name? ");
		String name = kin.nextLine();

		System.out.println("Hello " + name + ", it's nice to meet you!");
		
                System.out.print("What is your address? ");
		String address = kin.nextLine();

		System.out.println("cool I don't live there" + address + ", it's nice to know!");
                System.out.print("What is your city? ");
		String city = kin.nextLine();

		System.out.println("" + city + "");
 
                System.out.print("What is your state? ");
		String state = kin.nextLine();

		System.out.println("" + state + "");

                System.out.print("What is your Zip? ");
		String Zip = kin.nextLine();

		System.out.println("" + Zip + "");
                System.out.println(name);
		System.out.println(address);
                System.out.println(city);
	        System.out.println(state);
                System.out.println(Zip);
          }
}
