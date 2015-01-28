import java.util.Scanner;


public class FormatingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		String aInHex = Integer.toHexString(a);
		String aInBin= Integer.toBinaryString(a);
		long aInBinFinal= Integer.parseInt(aInBin);
		
		System.out.printf("|%-10s |%010d| %10.2f|%-10.3f",aInHex,aInBinFinal,b,c);


	}

}
