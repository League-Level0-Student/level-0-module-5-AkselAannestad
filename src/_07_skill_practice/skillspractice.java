package _07_skill_practice;
import java.util.Random;
import javax.swing.JOptionPane;
public class skillspractice {
public static void main(String[] args) {
	skillspractice skills= new skillspractice();
		//skills.skill1();
		//skills.skill2();
		//skills.skill3();
		skills.skill4();
		//skills.skill5();
}
 void skill1() {
	String dimes=JOptionPane.showInputDialog("how many dimes do you have?");
	int dimenum=Integer.parseInt(dimes);
	JOptionPane.showMessageDialog(null, "Then you have "+dimenum*10+" cents");
	
	String height=JOptionPane.showInputDialog("How many inches tall are you?");
	int heightnum=Integer.parseInt(height);
	if (heightnum<=36) {
		JOptionPane.showMessageDialog(null, "Eat Your Wheaties");
	}}
	
	void skill2() {
		int x=1;
	for(int i=0;i<10;i++) {
		System.out.println(x);
		x=x+3;
	}
	}
	
	void skill3() {
		Random r =new Random();
		int rint=r.nextInt(20);
		System.out.println(rint);
		
	}
	void skill4() {
		boolean city=JOptionPane.showInputDialog("do you live in san diego?") != null;
	
	if (city==true) {
	JOptionPane.showMessageDialog(null, "You live in Americas finest city");}
	else {
		JOptionPane.showMessageDialog(null, "Move there");
	}
	}
	
	void skill5() {
		String school=JOptionPane.showInputDialog("What is the name of your school");
		JOptionPane.showMessageDialog(null, school+" is a fantastic school!");
				
	}
	}
	
	
		

	

 