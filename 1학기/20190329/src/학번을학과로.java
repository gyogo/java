import java.util.Scanner;

public class �й����а��� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�й��� �Է��ϼ���.");
		String a=sc.next();
		String grade=a.substring(0,1);
		String ban=a.substring(1,2);
		
		if(grade.equals("1")||grade.equals("2")) {
			if(ban.equals("1")||ban.equals("2")) {
				System.out.println("�����̴�����Ʈ�����");
			}
			else if(ban.equals("3")||ban.equals("4")) {
				System.out.println("���̵�����ַ�ǰ�");
			}
			else if(ban.equals("5")||ban.equals("6")) {
				System.out.println("���̵������ΰ�");
			}
		}
		else if(grade.equals("3")) {
			if(ban.equals("1")||ban.equals("2")) {
				System.out.println("���ͷ�Ƽ��̵���");
			}
			else if(ban.equals("3")||ban.equals("4")) {
				System.out.println("���̵������ΰ�");
			}
			else if(ban.equals("5")||ban.equals("6")) {
				System.out.println("���̵��ַ�ǰ�");
			}
		}
	}

}
