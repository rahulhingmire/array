// multidimentional arrays
package Arrays;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimention of matrix: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		System.out.println("Enter the matrix a: ");
				for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						a[i][j]=sc.nextInt();
					}
				}
		System.out.println("Enter the matrix b: ");
				for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						b[i][j]=sc.nextInt();
					}
				}
		int result[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The addition of two matrix is as below");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
