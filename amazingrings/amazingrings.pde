void setup(){
size(1000,500);
background(255,0,255);
}

void draw(){
//The ring is moving the distance I want, but it happens all at once. 

int cor=200;
 for(int i=0; i<20; i++){
  ring1(cor);
   cor=cor+10;
  try {
    Thread.sleep(50);}catch(InterruptedException e){ e.printStackTrace();} 
   catch (Exception e) {
    // TODO: handle exception
  }
  background(255, 0, 255);


   System.out.println(mouseX);
  System.out.println(mouseY);
 System.out.println("test");
 }

 
 
 }


void ring1(int cor){
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
