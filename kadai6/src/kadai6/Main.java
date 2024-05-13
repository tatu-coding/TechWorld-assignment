package kadai6;

public class Main {
	public static void main(String[] args) {
		GetNum getNum = new GetNum();
		int[] numbers = getNum.getNumber();
		
		Cal cal = new Cal();
		int sum = cal.calculateSum(numbers);
		
		IsMul4 isMul4 = new IsMul4();
		boolean isMultipleOfFour = isMul4.isMultipleOfFour(sum);
		
		if(isMultipleOfFour) {
			System.out.println("入力された数字の総和は4の倍数である");
		} else {
			System.out.println("入力された数字の総和は4の倍数ではない");
		}
	}
}
