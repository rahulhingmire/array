package Arrays;

public class insertionsort {

	public static void main(String[] args) {
		int temp=0;
		int a[]= {10,14,9,3,16};
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(a[j]<a[j-1]) {
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
				else {
					break;
				}
		}
		}
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+" ");
		}

	}

}
