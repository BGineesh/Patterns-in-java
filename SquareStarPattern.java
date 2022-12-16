// Print the following pattern for the given N number of rows.
// Pattern for N = 5
//* * * * * 
//*       * 
//*       * 
//*       * 
//* * * * *



package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		for(;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 ||i==5|| j==1||j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
