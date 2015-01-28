import java.util.Scanner;


public class SmallestNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int smallestNumber=Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			int a = input.nextInt();
			if(a<=smallestNumber)
				smallestNumber=a;
		}
		System.out.println(smallestNumber);
	}

}
