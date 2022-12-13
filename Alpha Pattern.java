Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
 
 
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		int n;
		int i=1;
		Scanner sc= new Scanner(System.in);
		
		n= sc.nextInt();
		
		while(i<=n) {
			int j=1;

			while(j<=i) {
				char p=(char)('A'+i-1);
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}

		
	}

}
