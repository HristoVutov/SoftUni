import java.util.Scanner;


public class DecimalToHexadecimal {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String finalNumber = Integer.toHexString(a);

		System.out.println(finalNumber);
	}
}
