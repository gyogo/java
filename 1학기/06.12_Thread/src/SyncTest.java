
public class SyncTest {
	private int num=0;
	private int sum=0;
	public synchronized void IncreaseNumber() {
			num++; //읽고쓰는 작업
			sum=sum+num; 
		}
	public void IncreaseNumber2() {
		synchronized (this) {
			num++;
		}
		sum=sum+num;
	}
	public static void main(String[] args) {
		
	}

}
