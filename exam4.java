package exam4;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	
	int num;
	int count = 0;
	
	
	while (true) {
		
		num = in.nextInt();
		
		if ((num % 3 != 0) && (num % 5 != 0)) {
			
			count += 1;
			
			
		}
	
		if (num == 0) {
			
			break;
		}
	}
	
	System.out.println(count);
	
	in.close();
			
	
	
	}
	
	
			
}	
			

		
		


