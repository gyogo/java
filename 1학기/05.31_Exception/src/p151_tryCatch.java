
public class p151_tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] irum = new String[3];
		irum[0]="��ä��";
		irum[1]="��ä��";
		irum[2]="�ڱ���";
		try {
		for(int i =0; i<=irum.length; i++) {
			System.out.println(irum[i]);
		}
	} catch (ArrayIndexOutOfBoundsException e) { //CATCH���� �ϳ��� ����ǰ� finally�� ������ �����
			System.out.println("���� �߻�");
			e.printStackTrace(); 
		}catch(Exception e) {
			System.out.println("�ͼ���");
		}
		finally {
			System.out.println("������ �����մϴ�.");
		}
}
}
