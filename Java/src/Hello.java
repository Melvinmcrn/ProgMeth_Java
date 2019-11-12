import java.util.Arrays;
import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[] f = new int[n];
		f[0] = 0;
		f[1] = 1;
		
		for(int i=2; i < f.length; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		System.out.print(Arrays.toString(f));
/*		for(int i=0; i<f.length; i++) {
			System.out.print(f[i] + ",");
		}*/
	}

}
