import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExam {

	public static void main(String[] args) {
		char buffer[]=new char[100];
		
		
		try {
			FileReader fr;
			fr = new FileReader("datar.txt");
			FileWriter fw = new FileWriter("dataw.txt");
			fr.read(buffer,0,100);
			String str = new String(buffer);
			System.out.println(str);
			fw.write(buffer);
			fw.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		

	}

}
