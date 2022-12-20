Print the following pattern for the given number of rows.
Pattern for N = 4
    1
   232
  34543
 4567654
567898765


The dots represent spaces.
  
public static void main(String[] args) {
		int n;

		try(Scanner sc =new Scanner(System.in)){
			n=sc.nextInt();
		}
		int i=1;
		while(i<=n){
			int space=1;
			while(space<=n-i){
				System.out.print(" ");
				space++;
			}
			int num=1;
			int inc=i;
			while(num<=i) {
				System.out.print(inc);
				inc++;
				num++;
			}
			int num2=2*i-2;
			while(num2>=i) {
				System.out.print(num2);
				num2--;
			}
			System.out.println();
			i++;

		}
	}
