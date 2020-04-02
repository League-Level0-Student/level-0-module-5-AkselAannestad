package _07_skill_practice;
import java.util.Random;
import javax.swing.JOptionPane;
public class skillspractice {
public static void main(String[] args) {
	skillspractice skills= new skillspractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
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
		Random r2=new Random();
		int rint2=r2.nextInt(20);
		System.out.println(rint2);
		if (rint>rint2) {
		JOptionPane.showMessageDialog(null,(rint-rint2) );}
		else {JOptionPane.showMessageDialog(null, (rint2-rint) );
		}
		}
		
	
	void skill4() {
		boolean city;
		String ask=JOptionPane.showInputDialog("Do you live in San Diego? (1 for yes, 2 for no)");
		int num=Integer.parseInt(ask);
		if (num==1) {JOptionPane.showMessageDialog(null, "you live in americas finest city");}
		else {JOptionPane.showMessageDialog(null, "move there nerd!");}
		
		String cars=JOptionPane.showInputDialog("how many cars do you have?");
		int carint=Integer.parseInt(cars);
		JOptionPane.showMessageDialog(null, "Your cars have "+carint*4+" wheels in total");
	}
	
	
	void skill5() {
		String school=JOptionPane.showInputDialog("What is the name of your school");
		JOptionPane.showMessageDialog(null, school+" is a fantastic school!");
				
	}
	}
	
	
		

	

 