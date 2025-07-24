package day1.constructor;

public class Customer {
	private int id;
	private String name;
	private String city;
	
	
	//Default constructor
	public Customer() {
		System.out.println("Default Constructor called");
		
	}
	//Parameterized constructor
	public Customer(int id, String name, String city) {
		//this(); //Invoke the default constructor
		this(708,"Ramya");
		System.out.println("The Constructor Parameter");
		this.id = id;
		this.name = name;
		this.city = city;
	}
		public Customer(int id, String name) {
			this.id = id;
			this.name = name;
				System.out.println(id +" : "+name);
		}  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}