package ex05;

public class Ex05 {

	public static void main(String[] args) {
		String i = "0";
		
		Integer iint = Integer.valueOf(i);
		
		while (iint < 100) {
			System.out.println(iint);
			iint++;
		}
	}

}
