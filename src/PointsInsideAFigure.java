import java.util.Scanner;


public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		boolean answer = isInside(a,b);
		System.out.println(answer ? "Inside":"Outside");
		
	}
	
	public static boolean isInside(double x,double y){
		boolean isInside=false;
		double figureOneVerticalmin = 6;
		double figureOneVerticalmax = 8.5;
		double figureTwoVerticalmin = 8.5;
		double figureTwoVerticalmax = 13.5;
		double figureThreeVerticalmin = 6;
		double figureThreeVerticalmax = 13.5;

		double figureOneHorizontalmin = 12.5;
		double figureOneHorizontalmax = 22.5;
		double figureTwoHorizontalmin = 12.5;
		double figureTwoHorizontalmax = 17.5;
		double figureThreeHorizontalmin = 20;
		double figureThreeHorizontalmax = 22.5;
		
		if((figureOneHorizontalmin<=x&&figureOneHorizontalmax>=x)&&
				(figureOneVerticalmin<=y&&figureOneVerticalmax>=y)){
			isInside = true;
			return isInside;
		}
		else if((figureTwoHorizontalmin<=x&&figureTwoHorizontalmax>=x)&&
				(figureTwoVerticalmin<=y&&figureTwoVerticalmax>=y)){
			isInside = true;
			return isInside;
		}
		else if((figureOneHorizontalmin<=x&&figureOneHorizontalmax>=x)&&
				(figureThreeVerticalmin<=y&&figureThreeVerticalmax>=y)){
			isInside = true;
			return isInside;
			
		}
		
		return isInside;
	}

}
