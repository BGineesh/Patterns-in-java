Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*


public static void main(String[] args) {
       int n;

		try(Scanner sc =new Scanner(System.in)){
			n=sc.nextInt();
		}
    //First Half
		int i=1;
		System.out.println("*");
		while(i<=n) {

			int j=1;
			System.out.print("*");
			while(j<=i) {

				System.out.print(j);
				j++;
			}
			j--;
			while(--j>=1) {
				System.out.print(j);
			}
			System.out.print("*");
			System.out.println();
			i++;
		}
    // Second Half
		i=n-1;
		while(i>0) {
			int k=1;
			System.out.print("*");
			while(k<=i) {
				System.out.print(k);
				k++;
			}
			k--;
			while(--k>=1) {
				System.out.print(k);
			
			}
			System.out.print("*");
			System.out.println();
			i--;
		
		}
		System.out.print("*");
        
    }
