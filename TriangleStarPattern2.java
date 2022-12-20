Print the following pattern
Pattern for N = 4
    *
   ***
  *****
 *******
*********
The dots represent spaces.
  
  
 public static void main(String[] args) {
		int n;
		try(Scanner sc = new Scanner(System.in)){
			n=sc.nextInt();
		}
		int i=1;
		while(i<=n){
			int space=1;
			while(space<=n-i){
				System.out.print(" ");
				space++;
			}
      //Method 1
			int star=1;
			while(star<=(2*i)-1){
				System.out.print("*");
			 	star++;
			}
      //Method 2
			// int star=1;
			// while(star<=i){
			// 	System.out.print("*");
			// 	star++;
			// }
			// int star2=i-1;
			// while(star2>=1){
			// 	System.out.print("*");
			// 	star2--;
			// }
			System.out.println();
			i++;
		}
		
	}
