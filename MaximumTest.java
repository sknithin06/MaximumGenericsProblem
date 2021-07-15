package bridgelabz;
import java.util.Scanner;
public class MaximumTest {
	static void numMaximumFloat(Float a, Float b, Float c) {
		if (b.compareTo(a) > 0) {
			if (b.compareTo(c) > 0) {
				Float max = b;
				System.out.println("Maximum value is b:"+max);
			}
		}
		if (c.compareTo(a) > 0) {
			if (c.compareTo(b) > 0) {
				Float max = c;
				System.out.println("Maximum value is c:"+max);
			}
		}
		else {
			 Float max = a;
			System.out.println("Maximum value is a:"+max);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Generic Problem");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First Number:");  
		Float a = sc.nextFloat();
		System.out.print("Enter your Second Number:");
		Float b = sc.nextFloat();
		System.out.print("Enter your Third Number:");
		Float c = sc.nextFloat();
		
		MaximumTest value = new MaximumTest();
		value.numMaximumFloat(a, b, c);
	}
}
