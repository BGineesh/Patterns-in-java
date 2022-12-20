Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
  
public static void main(String[] args) {
		int n;

		try(Scanner sc =new Scanner(System.in)){
			n=sc.nextInt();
		}
		int i=1;int j;
		while(i<=n) {
			j=i-1;
			while(j<n) {
				int k=j*2+1;
				System.out.print(k);
				j++;
			}
			j=0;
			while(j<i-1) {
				int k=j*2+1;
				System.out.print(k);
				j++;
			}
			System.out.println();
			i++;
		}
	}
