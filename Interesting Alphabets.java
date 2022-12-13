Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE



import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
	
	int n;
	try(Scanner sc=new Scanner(System.in)){
		n=sc.nextInt();
	}
	int i=1;
	while(i<=n){
		int j=1;
		char p='A';
		p=(char)(p+n-i);

		while(j<=i){
			System.out.print(p);
			p=(char)(p+1);
			j++;
		}
		System.out.println();
		i++;
	}
	}
}
