package kadai2;

public class kadai2 {
	public static void main(String args[]) {
	
	System.out.println("一つ目の数字は?");
	
	int input1 = new java.util.Scanner(System.in).nextInt();
	
	System.out.println("二つ目の数字は？");
	
	int input2 = new java.util.Scanner(System.in).nextInt();
	
	int sum = input1 + input2;
	int dif = input1 - input2;
	double quo = (double)input1 / input2;
	int pro = input1 * input2;
	
	double max1 = Math.max(sum, dif);
	double max2 = Math.max(quo, pro);
	double maxFinal = Math.max(max1, max2);
	
	
	System.out.println(input1 + "と" + input2 + "の和は" + sum);
	System.out.println(input1 + "と" + input2 + "の差は" + dif);
	System.out.println(input1 + "と" + input2 + "の商は" + quo);
	System.out.println(input1 + "と" + input2 + "の積は" + pro);
	System.out.println("この中で一番大きいのは" +  maxFinal);
	
	}
}
