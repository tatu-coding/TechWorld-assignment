package lesson_6;

public class Cal {
	
	public static int tasu(int num1, int num2) {
		return(num1 + num2);
	}
	
	public static int hiku(int num1, int num2) {
		return(num1 - num2);
	}
	
	public static int kakeru(int num1, int num2) {
		return(num1 * num2);
	}
	
	public static int waru(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("divError");
			return 0;
		}
		else {
			return(num1/num2);
		}
	}

}
