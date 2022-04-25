package exam4;

import java.awt.Container;
import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		double base;
		double height;
		double mul;

		String con = " ";
		char conx = ' ';

		do {

			System.out.print("Base" + " = ");
			base = in.nextDouble();

			System.out.print("Height" + " = ");
			height = in.nextDouble();

			System.out.println("Base" + " = " + base);
			System.out.println("Height" + " = " + height);	

			mul = base * height / 2;
			System.out.println("Triangle width" + " = " + mul);

			System.out.print("Continue?: ");
			con = in.next();
			conx = con.charAt(0);

			System.out.println();
			
					
		} while (conx == 'y' || conx == 'Y');

		in.close();

	}

}
