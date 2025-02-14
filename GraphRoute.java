package dsaproject;

import java.util.Scanner;

public class GraphRoute {
	Route[] r = new Route[10];
	connection[][] d = new connection[10][10];
	int c = 0;

	GraphRoute() {
		for (int i = 0; i < r.length; i++) {
			r[i] = new Route();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				d[i][j] = new connection();
			}
		}
	}

	void input() {
		if (c < 10)
			r[c++].input();
		else
			System.out.println("full");
	}

	int index(String v) {
		for (int i = 0; i < c; i++) {
			if (v.equals(r[i].dest))
				return i;
		}
		return 0;
	}

	void add_conn(bstticket tt, arrc a) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter from");
		String f = s.next();
		System.out.println("enter to");
		String t = s.next();
		System.out.println("enter cost");
		double co = s.nextDouble();
		int i = index(f);
		int j = index(t);

		d[i][j].add(f, t, co);

		tt.input(a.tc(), co);

	}

	void displaybyrid(String r) {
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				if (r != null) {					
					if (d[i][j].rid != null) {
						if (d[i][j].rid.equals(r)) {
							System.out.println(
									d[i][j].rid + "  " + d[i][j].src + " to " + d[i][j].dest + " = " + d[i][j].cost);
						}
					}
				}
			}
		}
	}

	void disp() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter from");
		String f = s.next();
		System.out.println("enter to");
		String t = s.next();
		int i = index(f);
		int j = index(t);
		System.out.println(d[i][j].rid + "\t" + d[i][j].src + " to " + d[i][j].dest + " = " + d[i][j].cost);

	}

	void displayall() {
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				if (d[i][j].cost != 0.0) {
					System.out.println(d[i][j].rid + "\t" + d[i][j].src + " to " + d[i][j].dest + " = " + d[i][j].cost);
				}
			}
		}
	}

}
