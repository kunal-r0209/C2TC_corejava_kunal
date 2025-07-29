package day6.staticmethod;

public class Myclassdemo {
public static void main(String[] args) {
	Myclass m1=new Myclass();
	System.out.println(m1);
	
	Myclass.display();
	Myclass m2=new Myclass();
	System.out.println(m2);
	
	Myclass.display();
	Myclass m3=new Myclass();
	System.out.println(m3);
	
	Myclass.display();
	
}
}