// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 4444
// 4444
// 4444





import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	int n, i=1;
	Scanner sc = new Scanner(System.in);	

	n = sc.nextInt();

	while(i<=n){
		int j=1;
		while(j<=n){
			System.out.print(n);
			j++;
		}
		System.out.println();
		i++;
	}

	}

}
