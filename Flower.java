class Flower{
String name;
String color;
int noOfPetals;
 void bloom(){
System.out.println(color+" "+name+"is blooming...!");
}
void shedFragrance(){
System.out.println(color+" "+name+"is shedding fragrance...!");
}
public static void main(String[] args){
Flower rose=new Flower();
rose.name="Rose";
rose.color="yellow";
rose.noOfPetals=16;

Flower jasmine=new Flower();
jasmine.name="Jasmine";
jasmine.color="white";
jasmine.noOfPetals=7;

jasmine.bloom();
rose.bloom();
jasmine.shedFragrance();

rose.shedFragrance();

Flower lotus=new Flower();
lotus.name="lotus";
lotus.color="pink";
lotus.noOfPetals=15;

lotus.bloom();
lotus.shedFragrance();

}
}
