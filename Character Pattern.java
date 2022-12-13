Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG




import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		int n;
		int i = 1;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		while (i <= n) {
			char p= 'A';
			
			int j = 1;
            p=(char)(p+i-1);
			while (j <= i) {
				System.out.print(p);
				p=(char)(p+1);
				j++;
			}
			System.out.println();
			i++;
		}	
	}
}
