package dsaproject;

public class bstticket {
	ticket[] t = new ticket[20];
	int c = 0;

	bstticket() {
		for (int i = 0; i < t.length; i++) {
			t[i] = new ticket();
		}
	}

	void input(String tt, double a) {
		if (c < t.length) {
			int cc = 0;
			t[c].input(tt, a);
			while (cc < c) {
				if (t[c].amount < t[cc].amount) {
					if (t[cc].l == 0) {
						t[cc].l = c;
						break;
					} else {
						cc = t[cc].l;
					}
				} else {
					if (t[cc].r == 0) {
						t[cc].r = c;
						break;
					} else {
						cc = t[cc].r;
					}
				}
			}
			c++;
		} else {
			System.out.println("full");
		}
	}

	void min(arrc cc, flightlinklist f, GraphRoute r) {
		int ind = 0;
		while (t[ind].l != 0)
			ind = t[ind].l;

		cc.dd(f, r, t[ind].tickno);
		
	}

	void max(arrc cc, flightlinklist f, GraphRoute r) {
		int ind = 0;
		while (t[ind].r != 0)
			ind = t[ind].r;

		cc.dd(f, r, t[ind].tickno);

	

	}

}
