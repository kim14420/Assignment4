package exam4;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int end = 100;
		int sum = 0;
		
		if ((num <= 100) && (num > 0)) {
			
			while (true) {
				
				sum += num;
				
				num++;
				
				if (num > end) {
					
					break;
				}
			}
			
			System.out.println(sum);
		}
		 
	
				in.close();
		
	}

}
