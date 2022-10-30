public class H{
    public static void main(String[] args) {
        Fish machili = new Fish();
        machili.eat();
        machili.breathe();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating ...");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }
    void hunting(){
        System.out.println("Hunting...");
    }
    void breathe(){
        System.out.println("Breathing..");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swimming...");
    }
}
class Shark extends Fish{
    void jump(){
        System.out.println("Jumping on the ocean...");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying...");
    }
}
class Peacock extends Bird{
    void dancing(){
        System.out.println("Dance on the main road...");
    }
}
class mammal extends Animal{
    void breathe(){
        System.out.println("Mammal Breathing..");
    }
}
class cat extends mammal{
    void walking(){
        System.out.println("Cat walking");
    }
}
