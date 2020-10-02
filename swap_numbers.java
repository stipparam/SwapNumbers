import java.util.Scanner;
public class swap_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Welcome....\n");
		System.out.print("Enter first number ");
		int a=sc.nextInt();
		System.out.print("Enter second number ");
		int b=sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.print("The numbers after swapping are " + a + " and " + b);	
	}	
}
