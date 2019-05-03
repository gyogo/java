package gugudan;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		String[] 반3 = { "강지민", "강혜정", "김가영", "김나영", "김선옥", "김수진", "류정민", "박교령", "서남경", "오승연", "원예린", "원채린", "이서현",
				"이채린", "이현수", "임현진", "장유경", "장원이", "한다연" };
		System.out.println("번호를 입력하세요 이름을 알려드립니다.");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int number = sc.nextInt();
//			1 < =number <=18

			if (1 <= number && number <= 반3.length) {
				System.out.println(반3[number - 1]);
			} else {
				break;
			}
	}
	
	}
}

