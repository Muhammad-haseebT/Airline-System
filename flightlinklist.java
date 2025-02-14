package dsaproject;


public class flightlinklist {
	flight start;
	flight end;

	void enqueue() {
		flight s = new flight();
		s.input();
		if (start == null) {
			start = s;
			end = s;
		} else {
			end.next = s;
			end = s;
		}
	}

	void dequeue() {
		if (start == null) {
			System.out.println("empty");
		} else {
			start = start.next;
		}
	}

	void assignfid(String fid, String rid) {
		if (start == null)
			System.out.println("empty");
		else {

			flight t = start;
			while (t != null) {
				if (t.fid.equals(fid))
					break;
				t = t.next;
			}
			t.rid = rid;
		}
	}

	void fd(String f, GraphRoute r) {
		if (start == null)
			System.out.println("empty");
		else {

			flight t = start;
			while (t != null) {
				if (t.fid.equals(f)) {
					t.display();
					if (t.rid != null)
						r.displaybyrid(t.rid);

				}
				t = t.next;
			}
		}
	}

	void display(GraphRoute r) {
		if (start == null)
			System.out.println("empty");
		else {

			flight t = start;
			while (t != null) {
				t.display();
				if (t.rid != null)
					r.displaybyrid(t.rid);

				System.out.println();
				t = t.next;
			}
		}
	}

	void change(String i, String s) {
		if (start == null)
			System.out.println("empty");
		else {

			flight t = start;
			while (t != null) {
				if (t.fid.equals(i))
					break;
				t = t.next;
			}

			t.Status = s;
		}

	}

	void seats(String fid) {
		if (start == null)
			System.out.println("empty");
		else {

			flight t = start;
			while (t != null) {
				if (t.fid.equals(fid)) {
					System.out.println(t.Seats);
					break;
				}
				t = t.next;
			}

		}
	}

	void SeatsMinus(String fid) {
		if (start == null)
			System.out.println("empty");
		else {

			flight t = start;
			while (t != null) {
				if (t.fid.equals(fid))
					break;
				t = t.next;
			}
			t.Seats--;
		}

	}

}
