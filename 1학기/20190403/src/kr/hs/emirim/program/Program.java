package kr.hs.emirim.program;

public class Program {

	public static void main(String[] args) {
		
		Integer int1 = new Integer(100);
		Integer int2 = new Integer(100);
		Integer int3 = new Integer(200);
		System.out.println("int1.equals(int2) -->"+int1.equals(int2));
		System.out.println("int1.equals(int3) -->"+int1.equals(int3));
		System.out.println("--------------------------------------------------");
		
		System.out.println(new Integer(100).toString());
		System.out.println(new Double(55.7).toString());
		System.out.println("--------------------------------------------------");
		
		System.out.println(Integer.valueOf("123"));
		System.out.println(Double.valueOf("123.456"));
		
		System.out.println(Integer.parseInt("456"));
		
		System.out.println(Double.parseDouble("789.123"));

		System.out.println(new Integer(100).intValue());
		System.out.println(new Double(3.31).doubleValue());
	}

}
