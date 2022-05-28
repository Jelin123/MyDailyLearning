package busReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList<Bus> buses = new ArrayList<Bus>(); buses.add(new Bus(1,true,45));
		 * buses.add(new Bus(2,true,48)); buses.add(new Bus(3,false,50)); buses.add(new
		 * Bus (4,true,40));
		 * 
		 */

		int userOption = 1;
		Scanner scanner = new Scanner(System.in);

		while (userOption == 1) {

			System.out.println("Enter 1 to book and 2 to exit");

			userOption = scanner.nextInt();
			if (userOption == 1) {
				System.out.println("Booking.......");

			}

			if (userOption == 2) {
				System.out.println("Please exit......");
			}
		}

	}

}
