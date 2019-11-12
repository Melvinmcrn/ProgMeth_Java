import java.util.Scanner;

public class VowelsCounter {
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print(">>");
		String t = kb.nextLine();
		int count = 0;
		for (char c : t.toUpperCase().toCharArray()) {
			
			if ("AEIOU".indexOf(c) >= 0) {
				count++;
			}
		}
		System.out.println("There are " + count + " vowels");
		
	}

}
