package Arrays;

import java.util.Scanner;

public class Averageofamarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		int[] mark=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the mark of student "+i+":");
			mark[i]=sc.nextInt();
		}
		int avg=0;
		for(int i=0;i<n;i++) {
			avg+=mark[i];
		}
		avg/=n;
		System.out.println("Average mark of students is="+avg);
		

	}

}
