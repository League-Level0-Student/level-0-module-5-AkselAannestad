void setup(){
size(1000,500);
background(255,255,255);
}

void draw(){


//The thread.sleep line will pause the code for 2000 milliseconds(2 seconds). having trouble starting the code again after,
//as well as displaying movement of the shperes. Possibillity:Put method to draw ring inside a method to move

int cor=250;
 for(int i=0; i<20; i++){
   
  background(255,255,255);
 ring1(cor);
 cor=cor+10;
   
  try{
 Thread.sleep(2000);}catch(InterruptedException e){ e.printStackTrace();} 

}
 


 System.out.println("test");
 }



void ring1(int cor){
int x=250;
int y=10;

for(int i=0; i<30; i++){
ellipse(cor,250,y,y);
noFill();
y=y+10;
}}


void ring2(){
int a=750;
int b=10;
for(int i=0; i<30; i++){
ellipse(a,250,b,b);
noFill();
b=b+10;
}}



//void ring1(int cor){
//int x=250;
//int y=10;
//for(int i=0; i<30; i++){
//ellipse(x,250,y,y);
//noFill();
//y=y+10;
