package Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		int a[]= {22,26,7,9,98,24};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int k=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[k]) {
					k=j;
				}
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
			
		}
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+" ");
		}
	}

}
