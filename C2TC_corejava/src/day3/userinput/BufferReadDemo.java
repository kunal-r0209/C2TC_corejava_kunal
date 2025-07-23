package day3.userinput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReadDemo{
	public static void main(Sring[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter name:");
		name = br.readLine();
		
		int id;
		System.out.println("Enter your Id");
		id = br.readLine();
		Integer.parseInt(br.readline());
		
		float marks;
		System.out.println("Enter marks:");
		marks = Float.parseFloat(br.readLine());
		
		System.out.println("Name: " +name+ "id:"+id+"marks:"+marks);
	}
}
