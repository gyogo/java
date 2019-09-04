package javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 己利贸府 {
	static ArrayList<己利> 己利甸 = new ArrayList<>();
	public static void main(String[] args) {
		//颇老 楷搬
		//滚欺 楷搬
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while (( line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t");
				己利 new己利 = new 己利();
				new己利.setName(st.nextToken());
				new己利.setAddress(st.nextToken());
				new己利.setMath(Double.parseDouble(st.nextToken()));
				new己利.setEnglish(Double.parseDouble(st.nextToken()));
				
				己利甸.add(new己利);
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