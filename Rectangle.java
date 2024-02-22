import java.util.Scanner;

public class Rectangle{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int length, breadth, perimeter, area;
		System.out.print("Enter Length: ");
		length = scan.nextInt();
	
		System.out.print("Enter Breadth: ");
		breadth = scan.nextInt();
	
		area = length*breadth;
		perimeter = 2*(length+breadth);
	
		System.out.println("Area is " + area);
		System.out.println("Perimeter is " + perimeter);	
	}
}