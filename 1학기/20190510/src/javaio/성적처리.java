package javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ����ó�� {
	static ArrayList<����> ������ = new ArrayList<>();
	public static void main(String[] args) {
		//���� ����
		//���� ����
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while (( line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t");
				���� new���� = new ����();
				new����.setName(st.nextToken());
				new����.setAddress(st.nextToken());
				new����.setMath(Double.parseDouble(st.nextToken()));
				new����.setEnglish(Double.parseDouble(st.nextToken()));
				
				������.add(new����);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}