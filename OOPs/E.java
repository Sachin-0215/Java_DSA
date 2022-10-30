// Inheritance

public class E{
    public static void main(String[] args) {
        //single level inheritance
        
        fish shark=new fish();
        mammal m = new mammal();
        // mammal.setColor("red");
        // System.out.println(mammal.getcolor());
        /*  error: non-static method setColor(String) cannot be referenced from a static context
        mammal.setColor("red");
              ^
        E.java:8: error: non-static method getcolor() cannot be referenced from a static context
        System.out.println(mammal.getcolor());
                                 ^
        2 errors*/

        m.setColor("red");
        System.out.println(m.getcolor());
        shark.eat();
    }
}

//base class
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

//derived class
class fish extends Animal{
    int  finns;
    void swim(){
        System.out.println("Swimming..");
    }
}

class mammal extends Animal{
    void walking(){
        System.out.println("Walking...");
    }
}