package dsaproject;


import java.util.Scanner;

public class arrc {
	customer[] cus = new customer[10];
	int c = 0, d = 0, f = 0;

	arrc() {
		for (int i = 0; i < cus.length; i++) {
			cus[i] = new customer();
		}
	}

	void enqueue() {

		Scanner sc = new Scanner(System.in);
		if (c == d && f == 1)
			System.out.println("full");
		else {
			cus[c++].input(sc);
			if (c == 10) {
				c = 0;
				f = 1;
			}

		}

	}
	void dd(flightlinklist f, GraphRoute r,String t) {
		for (int i = 0; i < c; i++) {
			if(cus[i].ticketno.equals(t))
			{
				cus[i].display();
				f.fd(cus[i].fid,r);
			}
				
				
		}
	}

	void disp(flightlinklist f, GraphRoute r) {
		display();
		f.display(r);
		

	}

	void setfid(String fid, String cid) {
		for (int i = 0; i < cus.length; i++) {
			if (cus[i].ticketno.equals(cid) ) {
				cus[i].fid = fid;
				cus[i].cid=1;
				break;
			}
		}

	}
	String tc() {
		
		
		for (int i = 0; i < cus.length; i++) {
			
			if(cus[i].cid==1)
			{
				System.out.println(cus[i].cid);
				cus[i].cid=2;
				return cus[i].ticketno;
			}
		}
		return "";
	}
	void display() {
		if (c == d && f == 0)
			System.out.println("empty");
		else {
			if (c > d)
				for (int i = d; i < c; i++) {
					cus[i].display();
				}
			else {
				for (int i = d; i < cus.length; i++) {
					cus[i].display();
				}
				for (int i = 0; i < c; i++) {
					cus[i].display();
				}
			}

		}
	}

}
