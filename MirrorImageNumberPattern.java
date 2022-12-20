Print the following pattern for the given N number of rows.
Pattern for N = 4
...1
..12
.123
1234
The dots represent spaces.

  
  
  public static void main(String[] args) {
		int n, i=1;

		try(Scanner sc = new Scanner(System.in)){
			n=sc.nextInt();
		}

		while(i<=n){
			int sp=1;
			while(sp<=n-i){
				System.out.print(" ");
				sp++;
			}
			int st=1;
			while(st<=i){
				System.out.print(st);
				st++;
			}
			System.out.println();
		    i++;
		}
		
