package gugudan;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		String[] ��3 = { "������", "������", "�谡��", "�質��", "�輱��", "�����", "������", "�ڱ���", "������", "���¿�", "������", "��ä��", "�̼���",
				"��ä��", "������", "������", "������", "�����", "�Ѵٿ�" };
		System.out.println("��ȣ�� �Է��ϼ��� �̸��� �˷��帳�ϴ�.");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int number = sc.nextInt();
//			1 < =number <=18

			if (1 <= number && number <= ��3.length) {
				System.out.println(��3[number - 1]);
			} else {
				break;
			}
	}
	
	}
}

