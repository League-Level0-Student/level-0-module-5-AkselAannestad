package _06_for_loop_gauntlet;

public class Forloopgauntlet {
public static void main(String[] args) {
	
//0-100
	int x =0;
	for(int i=0;i<101;i++) {

	//	System.out.println(x);
		x+=1;
	}

//100-0
	int y =100;
	for(int i=0;i<101;i++) {

		//System.out.println(y);
		y-=1;
	}

//even from 2-100
int z =0;
for(int i =0; i<50; i++) {
z+=2;
System.out.println(z);
}


}}
