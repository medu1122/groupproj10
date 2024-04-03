package phtb2;
import java.util.Scanner;
public class bac2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		   
    	System.out.println("Nhap so a :");
    	int a =scanner.nextInt();
    	System.out.println("Nhap so b :");
    	int b =scanner.nextInt();
    	System.out.println("Nhap so c :");
    	int c =scanner.nextInt();
    	
    	if(a==0) {
    		if(  b==0) {
        		System.out.println("Phuong trinh vo so nghiem  !");
        		
        	}
        	else if( b!=0) {
        		System.out.println("Phuong trinh vo  nghiem !");
        		
        	}
    	}
    	else if(a!=0) {
    	
    	    int delta =b*b-4*a*c;
    	    
    	       if(delta<0) {
    	    	   System.out.println("Phuong trinh vo nghiem");
    	       }
    	       else if(delta==0) {
    	    	   System.out.println("Phuong trinh co nghiem kep ="+(-b)/2*a);
    	       }
    	       else {
    	    	   double x1=(-b+(Math.sqrt(delta))/2*a);
    	    	    double x2=(-b-(Math.sqrt(delta))/2*a);
    	    	   System.out.println("Phuong trinh co nghiem x1 ="+x1);
    	    	   System.out.println("Phuong trinh co nghiem x2 ="+x2);
    	       }
    	}
	

	}

}
