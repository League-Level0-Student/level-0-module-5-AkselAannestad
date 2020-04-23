import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot r=new Robot();
	static int height;
	String househeight;
public static void main(String[] args) {
	
	r.setSpeed(100000);
	r.setPenWidth(5);
	
	r.turn(-90);
	r.move(350);
	r.turn(-90);
	r.move(100);
    r.turn(-90);
    r.penDown();
    
  
   String househeight=JOptionPane.showInputDialog("do you want a small, medium, or large house (1,2,or 3)");
  
   int x=Integer.parseInt(househeight);
 
if(x==1){int height=60;}
else if(x==2){int height=120;}
else if(x==3){int height=250;}
else {JOptionPane.showMessageDialog(null, "bruh");}
    

    for(int i=0; i<10; i++) {
   drawHouse1(height);
    }

   
}
static void drawHouse1(int height) {
r.setPenColor(0,255,0);
r.turn(-90);
r.move(height);
r.turn(90);
r.move(25);
r.turn(90);
r.move(height);
r.turn(-90);
r.move(50);
}



}
