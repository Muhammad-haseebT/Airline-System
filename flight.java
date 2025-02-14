package dsaproject;

import java.util.Scanner;

public class flight {
	String rid,fid, Status = "rest";
	int Seats;
	
	flight next;
	static int c=0;
	void input() {
		Scanner s=new Scanner(System.in);
		fid = "F-" + (++c);
		System.out.println("enter no of seats in that flight");
		Seats = s.nextInt();
		System.out.println("enter Flight Status Rest / Start Flight / Reach Flight ");
		Status = s.next();
		
		
	}
	void display() {
		System.out.println("Flight ID = "+fid+"\tFlight Seats = "+Seats+"\tFlight status = "+Status);
	}

}
