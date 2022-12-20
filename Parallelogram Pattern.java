Write a program to print parallelogram pattern for the given N number of rows.
For N = 5
*****
 *****
  *****
   *****
    *****

  
  
  public static void main(String[] args) {
		int n;
		try(Scanner sc = new Scanner(System.in)){
			n=sc.nextInt();
		}
		int i=1;
		while(i<=n){
			int space=2;
			while(space<=i){
				System.out.print(" ");
				space++;
			}
			int star=1;
			while(star<=n) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;
		}
	}
