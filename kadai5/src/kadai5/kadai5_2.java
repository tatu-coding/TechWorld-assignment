package kadai5;

public class kadai5_2 {
	public static void main(String args[]) {
		
		int[] numbers = {10, 3, 100, 90, 54};
		
		array_sort(numbers);
			
	}

	public static void array_sort(int[] array) {
		int max = array[0];
		int min = array[0];
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			
			if(min > array[i]) {
				min = array[i];
			}
			
			sum += array[i];
		}
		
		int average = sum/array.length;
		
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + average);
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);
	}
}
