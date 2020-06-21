package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args){
	// TODO Auto-generated method stub
int check = 0;
	String x=JOptionPane.showInputDialog("enter a number and lets see if its prime");
	int y=Integer.parseInt(x)
			;
	for (int i = 2; i < y; i++) {
		if(y%i==0) {check=0; break;}
		else {check=1;}
	}
if(check==0) {System.out.print("The number is not prime");}
else {System.out.print("The number is prime");}


}
}
