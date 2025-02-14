package dsaproject;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		arrc c = new arrc();
		flightlinklist f = new flightlinklist();
		GraphRoute r = new GraphRoute();
		bstticket t=new bstticket();
		int ch = 0;

		do {
			System.out.println("press 1 to add customer" 
					+ "\npress  2  to add Flight" 
					+ "\npress  3  to assign flight to customer"
					+ "\npress  4  to cancel flight"
					+ "\npress  5  to add route"
					+ "\npress  6  to add connections" 
					+ "\npress  7  to assign route to flight"
					+ "\npress  8  to change flight status" 
					+ "\npress  9  to show all customers"
					+ "\npress  10  to show all flights" 
					+ "\npress  11 to show available seats"
					+ "\npress  12 to show all bookings"
					+ "\npress  13 to show min"
					+ "\npress  14 to show max" 
					+ "\npress  0  to Exit");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				c.enqueue();
				break;
			case 2:
				f.enqueue();
				break;
			case 3:
				
			case 4:
				f.display(r);
				System.out.println("enter flight id you want");
				String fid = s.next();
				c.display();
				System.out.println("enter ticketno");
				String cid = s.next();
				c.setfid(fid,cid);
				f.SeatsMinus(fid);
				break;
			case 5:
				r.input();
				break;
			case 6:
				r.add_conn(t, c);
				break;
			case 7:
				f.display(r);
				System.out.println("enter flight id");
				String id = s.next();
				r.displayall();
				System.out.println("enter route id");
				String rid = s.next();
				f.assignfid(id, rid);
				break;
			case 8:
				f.display(r);
				System.out.println("enter flight id");
				String d = s.next();
				System.out.println("enter updated status ");
				String st = s.next();
				f.change(d, st);
				break;
			case 9:
				c.display();
				break;
			case 10:
				f.display(r);
				break;
			case 11:
				f.display(r);
				System.out.println("enter flight id");
				String fd = s.next();
				f.seats(fd);
				break;
			case 12:
				c.disp(f, r);
				break;
			case 13:
				t.min(c, f, r);
				break;
			case 14:
				t.max(c, f, r);
				break;
			}

		} while (ch != 0);

	}
}
