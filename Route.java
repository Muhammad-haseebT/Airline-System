package dsaproject;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Route {

	
	
	int rid;
	String dest;
	
	Date d;
	Time t;
	static int c=0;
	void input()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter place");
		dest=s.next();
		
	}
	
	

}
