package tirangle;
import java.util.*;
public class Traingle {

	public static void main(String[] args) {
	        System.out.println("     it's a program that prompts the user \n"
	        +"     to enter the x- and y-coordinates of the three \n"
	        +"     corner points in a triangle and then displays \n"
	        +"     the triangle's  angles\n");
	        Scanner spots=new Scanner(System.in);
	        System.out.print(" pleas enter  x1 :");
	        double x1=spots.nextInt();
	        System.out.print(" pleas enter  y1 :");
	        double y1=spots.nextInt();
	        System.out.print(" pleas enter  x2 :");
	        double x2=spots.nextInt();
	        System.out.print(" pleas enter  y2 :");
	        double y2=spots.nextInt();
	        System.out.print(" pleas enter  x3 :");
	        double x3=spots.nextInt();
	        System.out.print(" pleas enter  y3 :");
	        double y3=spots.nextInt();

	        double a=Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3,2));
	        double b=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3,2));
	        double c=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
	        System.out.println("the first side of the triangle a = "+a);
	        System.out.println("the second side of the triangle b = "+b);
	        System.out.println("the third side of the triangle c = "+c);

	        System.out.println("\n");
	        System.out.println("this are the triangle's angles in to the radian");
	      double Ar = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
	      double Br = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
	      double Cr = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
	      System.out.println("Ar :"+Ar );
	      System.out.println("Br :"+Br );
	      System.out.println("Cr :"+Cr );

	      System.out.println("\n");
	        System.out.println("this are the triangle's angles in to the degrees");
	      double Ad =Math.toDegrees( Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
	      double Bd = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
	      double Cd = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
	      System.out.println("Ad :"+Ad);
	      System.out.println("Bd :"+Bd);
	      System.out.println("Cd :"+Cd);

	}

}
