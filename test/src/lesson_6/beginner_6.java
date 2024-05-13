package lesson_6;

import java.util.Scanner;

public class beginner_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int tasu = num1 + num2;
		int hiku = num1 - num2;
		int kakeru = num1 * num2;
		int waru = 0;
		if(num2 == 0){
			System.out.println("割り算エラー");
		}
		else {
			waru = num1 / num2;
		}
		
		System.out.println("和は" + tasu);
		System.out.println("差は" + hiku);
		System.out.println("積は" + kakeru);
		System.out.println("商は" + waru);
		
		scanner.close();
		
	}
}
