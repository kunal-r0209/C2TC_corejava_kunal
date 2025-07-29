package day4;
import day4.Base;
public class Executor2 {
	public static void main(String[] args) {
		// accessing different package class
		Base b1 = new Base();

		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}