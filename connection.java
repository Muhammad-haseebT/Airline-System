package dsaproject;

public class connection {

	String rid,src,dest;
	static int c=1;
	double cost;
	
	void add(String s,String d,double co) {
		
		rid="R-"+(c++);
		src=s;
		dest=d;
		cost=co;
		System.out.println(rid);
		
	
	
	}
	
	
}
