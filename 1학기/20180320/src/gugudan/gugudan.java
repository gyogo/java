package gugudan;
//2019-03-15

import java.util.*;

public class gugudan {

	public static void main(String[] args) {

	/*	while (true) {
			System.out.println("==============================");
			System.out.println("(1,13,5,7,9)��� ���� �Է��ϼ���");
			// �Է¹���
			Scanner sc = new Scanner(System.in);

			int member;
			member = sc.nextInt();

			if (member == 5) {
				System.out.println("itzy");
			}

			else if (member == 7) {
				System.out.println("BTS");
			}

			else if (member == 9) {
				System.out.println("EXO");
			}

			else if (member == 1) {
				System.out.println("IU");
			} 
			else if (member == 13) {
				System.out.println("Seventen");
			} 
			else {
				System.out.println("�� ���� ����� �����ϴ�.");
			break;
			}

		}*/
		
		Scanner sc = new Scanner(System.in);
		int member;
		System.out.println("(1,13,5,7,9)��� ���� �Է��ϼ���");
		for (int i=0;;  i++) {
			member = sc.nextInt();

			if (member == 5) {
				System.out.println("itzy -�̾ �Է�");
			}

			else if (member == 7) {
				System.out.println("BTS -�̾ �Է�");
			}

			else if (member == 9) {
				System.out.println("EXO -�̾ �Է�");
			}

			else if (member == 1) {
				System.out.println("IU -�̾ �Է�");
			} 
			else if (member == 13) {
				System.out.println("Seventen -�̾ �Է�");
			} 
			else {
				System.out.println("�� ���� ����� �����ϴ�.");
			break;
			}
		}

	}

}
