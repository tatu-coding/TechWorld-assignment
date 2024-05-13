package kadai4;

public class kadai4_2 {
	public static void main(String args[]) {
		int[][] scores = {
				{92, 89, 98, 99}, //学生A {英語, 国語, 数学, 理科}
				{78, 79, 94, 86}, //学生B
				{95, 98, 89, 87}  //学生C
		};
		String[] subjects = {"英語", "国語", "数学", "理科"};
		String[] students = {"生徒A", "生徒B", "生徒C"};
		
		System.out.println("あなたの名前は？");
		String inputstudent = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("最高得点者かどうか知りたい教科は？");
		String inputsubject = new java.util.Scanner(System.in).nextLine();
		
		//教科のインデックスを検索
		int subjectIndex = 0;
		for (int i=0; i<subjects.length; i++) {
			if (subjects[i].equals(inputsubject)) {
				subjectIndex = i;
			}
		}
		
		//生徒のインデックスを検索
		int studentIndex = 0;
		for (int i=0; i<students.length; i++) {
			if (students[i].equals(inputstudent)) {
				studentIndex = i;
			}
		}
		
		//エラー処理
		if(subjectIndex == 0 || studentIndex == 0) {
			System.out.println("入力された生徒名または教科名が無効です。");
			return;
		}
		
		//教科の最高点を取得
		int maxscore = 0;		
		for(int i=0; i<students.length; i++) {
			if (scores[i][subjectIndex] > maxscore) {
				maxscore = scores[i][subjectIndex];
			} 
		}
		
		if(scores[studentIndex][subjectIndex] == maxscore) {
			System.out.println("あなたは" + inputsubject + "で最高得点者です。");
		} else {
			int diff = maxscore - scores[studentIndex][subjectIndex];
			System.out.println(inputsubject + "の最高得点まで" + diff + "点足りません。");
		}
	}
}
