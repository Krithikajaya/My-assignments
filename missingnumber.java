package assignment2;

import java.util.Arrays;

public class missingnumber {
public static void main(String[] args) {
	int a[]= {5,4,6,2,1,7};
	Arrays.sort(a);
	int sum=0;
	int total=0;
	//find the sum of all elements in a array
	for(int i=0;i<a.length;i++) {
	sum=sum+a[i];
	}
	//find sum all numbers in general
	for(int j=1;j<=7;j++) {
		total=total+j;
	}
	System.out.println("the missing number is:"+(total-sum));
}

}
