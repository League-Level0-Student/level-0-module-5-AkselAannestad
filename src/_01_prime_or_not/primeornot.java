package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String [] args) {
	// TODO Auto-generated method stub

	String x=JOptionPane.showInputDialog("enter a number and lets see if its prime");
	int y=Integer.parseInt(x);
	for (int i = 2; i < y; i++) {
		if(y%i==0) {System.out.println("This number is not prime");}
		else {System.out.println("This number is prime");}
	}

}
}
