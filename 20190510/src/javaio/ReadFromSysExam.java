package javaio;

import java.io.IOException;

public class ReadFromSysExam {

	public static void main(String[] args) {
		byte []h = new byte[1024];
		int len = 0;
		try {
			len=System.in.read(h);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.write(h,0,len);
	}

}
