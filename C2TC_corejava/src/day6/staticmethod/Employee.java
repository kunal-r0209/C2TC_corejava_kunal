package day6.staticmethod;

public class Employee {
private String name;
private int id;

static String companyname="TCS";
Employee(String name,int id){
	this.name=name;
	this.id=id;
	}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ",company="+companyname+"]";
}


}