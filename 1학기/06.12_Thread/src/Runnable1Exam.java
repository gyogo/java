class Top2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<50; i++) {
			System.out.println(i+"\t");
		}
	}
	
}

public class Runnable1Exam {
	public static void main(String[] args) {
		System.out.println("프로그램시작");
		Top2 t=new Top2();
		Top2 t2=new Top2();
		Thread thd = new Thread(t);
		thd.start();
		System.out.println("프로그램 종료");
	}

}
