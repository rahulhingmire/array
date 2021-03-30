package Arrays;

import java.util.Scanner;

public class Bubbleort {

	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
		int temp=0;
		int a[]= {10,14,9,3,16};
		int n=a.length;
		for(int i=0;i<=n;i++) {
			for(int j=n-1;j>=1;j--) {
				if(a[j]<a[j-1]) {
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
		}
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+" ");
		}
				
			


}
}
