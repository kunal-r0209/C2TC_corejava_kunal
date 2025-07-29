package day6.staticmethod;

public class Myclass {
private String section;
private static int srno;

static {
	System.out.println("-------within static block---------");
	srno=1999;
}
Myclass(){
	System.out.println("--------within default constructor---------");
}
@Override
public String toString() {
	return "Myclass [section=" + section + "]";
}

static void display() {
	System.out.println("serial no:"+srno);
	
}

}