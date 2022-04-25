package exam4;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		int start = 1;
		
		if ((num <= 100) && (num > 0)) {
			
			while (true) {
				
				sum += start;
//				sum = sum + start;
				start++;
				
				if (start > num) {
					
					break;
				}
			}
		}
		
		System.out.println(sum);
	
				in.close();
	}

}
