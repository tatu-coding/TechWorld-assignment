package kadai6;

import java.util.Scanner;

public class all {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5];
		int count = 0;
		
		System.out.println("5つ以下の整数を入力してください:");
		
		while(count < 5 && scanner.hasNextInt()) {
			numbers[count++] = scanner.nextInt();
		}
		
		
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		if(sum%4 == 0) {
			System.out.print("入力された数字の総和は4の倍数である");
		}else {
			System.out.println("入力された数字の総和は4の倍数ではない");
		}
		
		scanner.close();
		
		
	}
}
