public class N{
    public static void main(String[] args){
        // Horse ho=new Horse();
        // ho.eat();
        // ho.walk();

        // Hen he=new Hen();
        // he.eat();
        // he.walk();

        // // Animal an=new Animal();//Animal is abstract; cannot be instantiated-->error
        // // an.eat();
        // // an.walk();
        // System.out.println(ho.color);

        //showing hierachy of calling constructor
        Mustang mH=new Mustang();

    }
}

abstract class Animal{
    String color;
    Animal(){
        color="Brown";
        System.out.println("Animal Construxtor called..");
    }
    void eat(){
        System.out.println("Eating...");
    }
    abstract void walk();// implementation not there
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Construxtor called..");
    }
    void setcolor(){
        color="red";
    }
    void walk(){
        System.out.println("Walks on 4 leg");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustung Construxtor called..");
    }
}
class Hen extends Animal{
    void setcolor(){
        color="brown";
    }
    void walk(){
        System.out.println("Walk on 2 leg");
    }
}