package geeksforgeeks;

import java.util.Scanner;

public class newpra {
public static void main(String[] args) {
	Scanner sk=new Scanner(System.in);
	long[] arr=(long[]) new long[100000000];
	for(int i=0;i<3;i++) {
		arr[i]=sk.nextLong();
	}
	int n=sk.nextInt();
	for(int i=3;i<=n;i++) {
		arr[i]=arr[i-1]+arr[i-2]-arr[i-3];
	}
	 
System.out.print(arr[n]);
}
}
