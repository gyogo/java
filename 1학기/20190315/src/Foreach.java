
import java.util.Scanner;

public class Foreach {

	public static void main(String[] args) {
		int arr[]= new int[] {5, 7, 9, 1, 13};
		for ( int a:arr) {
			int number=a;
			
			if(number==7) {
				System.out.printf("��ź�ҳ�� ��� �� : %s",number);
				System.out.println();
			}
			else if(number==9){
				System.out.printf("���� ��� �� : %s", number);
				System.out.println();
			}
			else if(number==5) {
				System.out.printf("���� ��� �� : %s", number);
				System.out.println();
			}
			else if(number==1) {
				System.out.printf("IU ��� �� : %s",number);
				System.out.println();
			}
			else if(number==13) {
			System.out.printf("����ƾ ��� �� : %s",number);
		}
		}
		System.out.println();
		System.out.println("--------------------------");
		
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		if(number==7) {
			System.out.printf("��ź�ҳ�� ��� �� : %s",number);
		}
		else if(number==9){
			System.out.printf("���� ��� �� : %s", number);
		}
		else if(number==5) {
			System.out.printf("���� ��� �� : %s", number);
		}
		else if(number==1) {
			System.out.printf("IU ��� �� : %s",number);
		}
		else if(number==13) {
		System.out.printf("����ƾ ��� �� : %s",number);
	}
		else {
			System.out.println("�ٸ� ���� �Է����ּ���.");
		}
	}

}
