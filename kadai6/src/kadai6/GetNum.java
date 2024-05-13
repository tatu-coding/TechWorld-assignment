package kadai6;

import java.util.Scanner;

public class GetNum {
	
	public static int[] getNumber() {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		int count = 0;
		
		System.out.println("5つ以下の整数を入力してください:");
		
		while(count < 5 && scanner.hasNextInt()) {
			numbers[count] = scanner.nextInt();
			count++;
		}
		
		scanner.close();
		return numbers;			
	}		
}


