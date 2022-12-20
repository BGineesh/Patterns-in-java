Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
  

public static void main(String[] args) {
		int n;
		try(Scanner sc= new Scanner(System.in)){
			n=sc.nextInt();
		}
		
		int i=n;
		while(i>=1){
			int j=1;
			// Method 1
			while(j<=i){
				System.out.print(i);
				j++;
			}
			/* Method 2
			int p=n-i+1;
			while(j<=i){
				System.out.print(p);
				j++;
			}
			*/
			System.out.println();
			i--;
		}
