package com.infosys;

import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.config.AppConfig;
import com.infosys.dao.DAO;
import com.infosys.model.Customer;
import com.infosys.model.Flight;
import com.infosys.model.FlightCustomer;

@SpringBootApplication
public class JdbctemplatebootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JdbctemplatebootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DAO d = context.getBean(DAO.class);
		int counter = 1;

		while (counter==1) {
		System.out.println("Please select service:\n" + "1:BOOK A NEW FLIGHT\n "
				+ "2:DISPLAY ALL FLIGHTS FOR A PARTICULAR DESTINATION\n" + "3:CANCEL BOOKING\n"
				+ "4:UPDATING CUSTOMER DETAILS\n" + "5:DISPLAY FLIGHTS BOOKED BY A CUSTOMER\nEnter your choice: ");
		int ch = sc.nextInt();


			switch (ch) {

			// BOOK A NEW FLIGHT
			case 1:
				System.out.println("BOOK A NEW FLIGHT");
				FlightCustomer fc = new FlightCustomer();
				System.out.print("\nEnter customer id: ");
				fc.setCustomer_id(sc.nextInt());
				System.out.print("\nEnter customer first name: ");
				fc.setFirstname(sc.next());
				System.out.print("\nEnter customer last name: ");
				fc.setLastname(sc.next());
				System.out.print("\nEnter flight pnr number: ");
				fc.setPnr(sc.next());
				System.out.print("\nEnter flight seat number: ");
				fc.setSeatno(sc.next());
				System.out.println("STATUS:" + d.bookFlight(fc));
				break;

			// DISPLAY ALL FLIGHTS FOR A PARTICULAR DESTINATION
			case 2:
				System.out.print("\nDISPLAY ALL FLIGHTS FOR A PARTICULAR DESTINATION\nEnter Destination: ");
				String dest = sc.next();
				for (Flight f : d.displayFlights(dest)) {
					System.out.println(f);
				}
				break;

			// CANCEL BOOKING
			case 3:
				System.out.print("Enter customer id: ");
				int id=sc.nextInt();
				System.out.println("\nCANCELLING BOOKING\n STATUS: " + d.deleteBooking(id));
				break;

			// UPDATE CUSTOMER
			case 4:
				System.out.println("\nUPDATING CUSTOMER DETAILS");
				Customer c = new Customer();
				System.out.print("Enter new Email: ");
				c.setEmail(sc.next());
				System.out.print("Enter new number: ");
				c.setMobile_no(sc.nextInt());
				System.out.print("Enter customer id: ");
				
				System.out.println("STATUS: " + d.updateCustomer(c, sc.nextInt()));
				break;

			// DISPLAY FLIGHTS BOOKED BY A CUSTOMER
			case 5:
				System.out.print("\nDISPLAY FLIGHTS BOOKED BY A CUSTOMER\nEnter customer id: ");
				for (FlightCustomer f : d.displayBookedFlights(sc.nextInt())) {
					System.out.println(
							f.getLastname() + "/" + f.getFirstname() + "  " + f.getPnr() + "  " + f.getSeatno());
				}
				break;

			default:
				System.out.println("Please enter valid option");
				break;

			}
			System.out.println("Please enter 0 to quit and 1 to continue: ");
			counter=sc.nextInt();
		}

	}

}
