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
		//System.out.println(z);
	}

//odd from 1-99
	int a=0;
	for(int i =0; i<50; i++) {
		a+=1;
		//System.out.println(a);
		a+=1;
	}
//1-500 odd or even
	
	for(int i =1; i<501; i++) {
		//if(i%2==0) {System.out.println(i+" is even");}
		//else {System.out.println(i+" is odd");}
	}
//all multiples of 7 from 0-777
	int b=0;
	for (int i = 0; i <112; i++) {
		//System.out.println(b);
		b=b+7;
	}
//Years i was alive
	int year=2004;
	int years=0;
	for (int i = 0; i<16; i++) {
		//System.out.println("In "+year+" I was "+years+" years old");
		years=years+1;
		year=year+1;
	}
//

}}
