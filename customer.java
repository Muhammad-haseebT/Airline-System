package dsaproject;

import java.util.Date;
import java.util.Scanner;

public class customer {
	String fname, lname, pid, religon, city, nationality, Email, phoneNo, cnic, ticketno;
	String fid;
	int cid;
	static int c=0;
	Date Dob;

	void input(Scanner s) {
		ticketno = "T-" + (++c);
		System.out.println("Enter FName");
		fname = s.next();
		System.out.println("Enter lName");
		lname = s.next();
		System.out.println("Enter religon");
		religon = s.next();
		System.out.println("Enter city");
		city = s.next();
		System.out.println("Enter nationality");
		nationality = s.next();
		System.out.println("Enter Email");
		Email = s.next();
		System.out.println("Enter phoneNo");
		phoneNo = s.next();
		System.out.println("Enter cnic");
		cnic = s.next();
		System.out.println("Enter Passport No ");
		pid = s.next();
		System.out.println("Enter Date of Birth yyyy mm dd");
		Dob = new Date(s.nextInt(), s.nextInt(), s.nextInt());
	}
	void display() {
		System.out.println(ticketno+"\t"+fname + "\t" + lname + "\t" + pid + "\t" + religon + "\t" + city + "\t" + nationality + "\t"
				+ Email + "\t" + phoneNo + "\t" + cnic + "\t" + Dob.getYear() + "-" + Dob.getMonth() + "-"
				+ Dob.getDate());
	}
	
}
