Print the following pattern for the given number of rows.
Note: N is always odd.
Pattern for N = 5
  
     Your Output
  *
 ***
*****
 ***
  *
  
  
 public static void main(String[] args) {
        
       int n;

		try(Scanner sc =new Scanner(System.in)){
			n=sc.nextInt();
		}
		int n1=(n+1)/2;
		int n2=(n-1)/2;
		int i=1;
		while(i<=n1) {
			int sp=1;
			while(sp<=n1-i) {
				System.out.print(" ");
				sp++;
			}
			int st = 1;
			while(st<=2*i-1) {
				System.out.print("*");
				st++;
			}
			System.out.println();
			i++;
		}
		i=1;
		int c=n2;
		while(i<=n2) {
			int sp2=1;
			while(sp2<=i) {
				System.out.print(" ");
				sp2++;
			}
			int st2=1;
			while(st2<=2*c-1) {
				System.out.print("*");
				st2++;			
			}
			c= c-1;
			System.out.println();
			i++;
		} 
    } 
