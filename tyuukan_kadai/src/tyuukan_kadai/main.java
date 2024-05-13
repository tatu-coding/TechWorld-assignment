package tyuukan_kadai;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("数式を入力してください");
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("exit")) {
				break;
			}
			
			String[] inputTokens = input.split(" ");
			String[] rpn = ExpressionParser.infixtoRPN(inputTokens);
			double result = ExpressionParser.evaluateRPN(rpn);
			System.out.println("計算結果:" + result);
		}
		
		scanner.close();
	}
}
