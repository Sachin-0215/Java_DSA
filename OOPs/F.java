public class F{
    public static void main(String[] args) {
        // multilevel inheritance
        dog d=new dog();
        d.eat();
        d.legs=4;
        System.out.println(d.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eating..");
    }
    void breathe(){
        System.out.println("breathing..");
    }
    void setColor(String color){
        this.color=color;
    }
    String getcolor(){
        return this.color;
    }
}

class mammal extends Animal{
    int legs;
}
class dog extends mammal{
    String breeds;
}