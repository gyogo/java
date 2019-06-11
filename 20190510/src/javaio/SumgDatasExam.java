package javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SumgDatasExam {

	public static void main(String[] args) {
		 
		FileReader fr;
		try {
			fr = new FileReader("writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String csvStr = "";
			String tmpStr = "";
			while((tmpStr = br.readLine()) != null) {
				csvStr += tmpStr + "\t" ;	
			}
			//System.out.println(csvStr);
			StringTokenizer parse = new StringTokenizer(csvStr,"\t");
			int length = parse.countTokens()/4;
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}