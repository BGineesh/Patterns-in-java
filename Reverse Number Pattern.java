Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
  
  
 import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		int n, i=1, p;
		Scanner sc= new Scanner(System.in);
		
		n= sc.nextInt();
		
		while(i<=n) {
			int j=1;
			p=i;
			while(j<=i) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
