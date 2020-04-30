import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot r=new Robot();
	static String height;
	String househeight;
public static void main(String[] args) {
	
	r.setSpeed(100000);
	r.setPenWidth(5);
	
	r.turn(-90);
	r.move(350);
	r.turn(-90);
	r.move(100);
    r.turn(-90);
    r.setPenColor(0,255,0);
    r.penDown();
    

//String height=JOptionPane.showInputDialog("small house(60),medium house(120),or large(250)");

	
for(int i=0;i<10;i++){
	//drawHouse(height);
	randomHouse();
}
   
}
static void randomHouse() {
	int wall = 0;
	Random rand=new Random();
	int rnum=rand.nextInt(3);
	if(rnum==0) {wall=60;}
	else if(rnum==1) {wall=120;}
	else if(rnum==2) {wall=250;}
	System.out.println(rnum);
	r.turn(-90);
	r.move(wall);
	r.turn(90);
	if(wall==250) {flatRoof();}
	else {pointyRoof();};
	r.turn(90);
	r.move(wall);
	r.turn(-90);
	r.move(50);
}

static void drawHouse(String height) {
int wall=Integer.parseInt(height);
	r.turn(-90);
	r.move(wall);
	r.turn(90);
	//roof
	if(wall==250) {flatRoof();}
	else {pointyRoof();}
	r.turn(90);
	r.move(wall);
	r.turn(-90);
	r.move(50);
}
static void pointyRoof() {
	r.turn(-45);
	r.move((int)25);
	r.turn(90);
	r.move((int)25);
	r.turn(-45);
}

static void flatRoof() {
	r.move(25);
}

}
