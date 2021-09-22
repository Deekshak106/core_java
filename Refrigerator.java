class Refrigerator{
 String name;
 int price;
 String color;
 int temp;
  void cool(){
 System.out.println("If temperature is " +temp+ "keep the food in proper condition...");
 }
void speedChilling(){
 System.out.println(name +"refrigerator is good for speed chilling");
 }
 public static void main(String[] args){
Refrigerator refri= new Refrigerator();
refri.name="WHIRLPOOL";
refri.temp=6;
refri.color="brown";


refri.cool();
refri.speedChilling();
}
}
 