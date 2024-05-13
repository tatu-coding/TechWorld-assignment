package kadai6;

public class Cal {
	public int calculateSum(int[] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
