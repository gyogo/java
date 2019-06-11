
public class p155_NUllPointExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String str= null;
		System.out.println("문자열:"+str.length());
		}catch(NullPointerException npe) {
			System.out.println("npe.toString() :"+npe.toString());
		}finally {
			System.out.println("무조건 실행");
		}
	}

}
