package javaio;

import java.io.IOException;
import java.util.*;
public class java_lang {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputString = sc.nextLine();
//		
//		System.out.println(inputString);
//		System.err.println(inputString);
//	
		
		int bt;
		try {
			while((bt = System.in.read()) != -1) {	//�ѱ��ڸ� �д� ��. ��  int��
			System.out.println((char)bt);
				}
			} catch (IOException e) {
			e.printStackTrace();
		}
	}

}