import javax.swing.JOptionPane;

public class simples_sorter {
 public static void main(String[] args) {
	 
	 String one=JOptionPane.showInputDialog("Give number");
	 String two=JOptionPane.showInputDialog("Give number");
	 String three=JOptionPane.showInputDialog("Give number");
	 
	 int x=Integer.parseInt(one);
	 int y=Integer.parseInt(two);
	 int z=Integer.parseInt(three);
	 
	 if(x>y && x>z && y>z) {
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
	 }
	 if(x>z && x>y && z>y) {
		 System.out.println(x);
		 System.out.println(z);
		 System.out.println(y);
	 }
	 if(y>x && y>z && x>z) {
		 System.out.println(y);
		 System.out.println(x);
		 System.out.println(z);
	 }
	 if(y>x && y>z && z>x) {
		 System.out.println(y);
		 System.out.println(z);
		 System.out.println(x);
	 }
	 if(z>y && z>x && y>x) {
		 System.out.println(z);
		 System.out.println(y);
		 System.out.println(x);
	 }
	 if(z>y &&  z>x && x>y) {
		 System.out.println(z);
		 System.out.println(x);
		 System.out.println(y);
	 }
	 
 }
}
