package exam4;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int mul = 0;
		int count = 1;
		
		while (true) {
			
			mul = num * count;
					
			System.out.print(mul + " ");
			
			count++;
			
			if (count > 10) {
				
				break;
			}
		}
	
		in.close();
		
	}

}
