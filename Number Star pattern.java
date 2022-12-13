Pattern in N lines 
 5432*
 543*1
 54*21
 5*321
 *4321
 
  
  
import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		int n;
		try(Scanner sc = new Scanner(System.in)){
			n=sc.nextInt();
		}
		int i=1;
		int k;
		int j;
		while(i<=n) {
			j=n;
			for(;j>=1;j--) {
				if(i==j) {
					System.out.print("*");
					continue ;
				}
				System.out.print(j);
			}
			System.out.println();
			i++;
		}
	}
}
