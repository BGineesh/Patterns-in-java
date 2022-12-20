Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N

Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
  
 public static void main(String[] args) {
		int n;

		try(Scanner sc= new Scanner(System.in)){
			n=sc.nextInt();
		}
		int i=1;int j;
		int num;int sum;
		while(i<=n) {
			j=1;
			num=1;
			sum=0;
			while(j<=i) {
				System.out.print(num);
				sum+=num;
				if(num<i)System.out.print("+");
				num++;
				j++;
			}
			System.out.println("="+sum);
			i++;
		}
		
	}
