package _09_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obediantrobot {
	Robot rob=new Robot();
public static void main(String[] args)  {
	int r;
	int g;
	int b;
	String ask=JOptionPane.showInputDialog("do you want a square(1), triangle(2), or circle(3)?");
	int shape=Integer.parseInt(ask);
	
	
	if (shape==1) {drawsquare();}
	else if(shape==2) {drawtriangle();}
	else if(shape==3) {drawcircle();}
	else {JOptionPane.showMessageDialog(null, "Error. Please enter one of the possible numbers given ");}
}

public static void drawsquare() {
	Robot rob= new Robot();
	rob.penDown();
	rob.setSpeed(100);
	int r;
	int g;
	int b;
	String ask2=JOptionPane.showInputDialog("Do you want your shape to be red(1), green(2), or blue(3)");
	int color=Integer.parseInt(ask2);
	
	if(color==1) {rob.setPenColor(255,0,0);}
	else if(color==2) {rob.setPenColor(0,255,0);}
	else if(color==3) {rob.setPenColor(0,0,255);}
	else {JOptionPane.showMessageDialog(null, "Error. Please enter one of the possible numbers");}
	
	for(int i=0;i<4;i++) {
	rob.move(100);
	rob.turn(90);}
}


public static void drawtriangle() {
	Robot rob= new Robot();
	rob.penDown();
	rob.setSpeed(100);
	int r;
	int g;
	int b;
	String ask2=JOptionPane.showInputDialog("Do you want your shape to be red(1), green(2), or blue(3)");
	int color=Integer.parseInt(ask2);
	
	if(color==1) {rob.setPenColor(255,0,0);}
	else if(color==2) {rob.setPenColor(0,255,0);}
	else if(color==3) {rob.setPenColor(0,0,255);}
	else {JOptionPane.showMessageDialog(null, "Error. Please enter one of the possible numbers");}
	
	for(int i=0; i<3;i++) {
	rob.move(100);
	rob.turn(120);
	}	
}
public static void drawcircle() {
	Robot rob= new Robot();
	rob.penDown();
	rob.setSpeed(100);
	int r;
	int g;
	int b;
	String ask2=JOptionPane.showInputDialog("Do you want your shape to be red(1), green(2), or blue(3)");
	int color=Integer.parseInt(ask2);
	
	if(color==1) {rob.setPenColor(255,0,0);}
	else if(color==2) {rob.setPenColor(0,255,0);}
	else if(color==3) {rob.setPenColor(0,0,255);}
	else {JOptionPane.showMessageDialog(null, "Error. Please enter one of the possible numbers");}
	
	for(int i=0;i<360;i++) {
		rob.move(1);
		rob.turn(1);
	}
}

}
