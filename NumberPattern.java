package Patterns;

public class pattern3 {

	public static void main(String[] args) {

		int n=5;
		int i=1;
		for(;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int k=i+j-1;      //Method 1
				if(k>n) {
					System.out.print(k-n);
				}else {
					System.out.print(k);
				}
			}
			System.out.println();
		}

		//		for(;i<=n;i++) {                         // Method 2
		//			for(int j=i;j<=n;j++) {
		//				System.out.print(j);
		//			}
		//			int k;
		//			for(int j=0;j<i-1;j++) {
		//				k=j+1;
		//				System.out.print(k);	
		//			}
		//			System.out.println();
		//		}
	}
}


//12345
//23451
//34512
//45123
//51234

