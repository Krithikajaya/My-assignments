package assignment2;

public class fibinacci {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i;
		System.out.println(""+n1);
		System.out.println(""+n2);
		for (i= 0; i<10; i++) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
