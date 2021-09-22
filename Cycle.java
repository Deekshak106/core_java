class Cycle{
 int speed;
 int cost;
 String color;
 int gear;
  void speedUp(){
 System.out.println("SPEED:"+speed);
 }
void changeGear(){
 System.out.println("GEAR:"+gear);
 }
 public static void main(String[] args){
Cycle cycle= new Cycle();
cycle.speed=60;
cycle.cost=10000;
cycle.color="brown";
cycle.gear=2;

cycle.speedUp();
cycle.changeGear();
}
}
 