import java.util.Scanner;

public class 학번을학과로 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학번을 입력하세요.");
		String a=sc.next();
		String grade=a.substring(0,1);
		String ban=a.substring(1,2);
		
		if(grade.equals("1")||grade.equals("2")) {
			if(ban.equals("1")||ban.equals("2")) {
				System.out.println("뉴미이더소프트웨어과");
			}
			else if(ban.equals("3")||ban.equals("4")) {
				System.out.println("뉴미디어웹솔루션과");
			}
			else if(ban.equals("5")||ban.equals("6")) {
				System.out.println("뉴미디어디자인과");
			}
		}
		else if(grade.equals("3")) {
			if(ban.equals("1")||ban.equals("2")) {
				System.out.println("인터렉티브미디어과");
			}
			else if(ban.equals("3")||ban.equals("4")) {
				System.out.println("뉴미디어디자인과");
			}
			else if(ban.equals("5")||ban.equals("6")) {
				System.out.println("뉴미디어솔루션과");
			}
		}
	}

}
