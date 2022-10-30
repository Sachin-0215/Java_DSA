// multiple inheritance using java

public class P{
    public static void main(String[] args) {
        Bear b=new Bear();
        b.hunting();
        b.eating();2
    }
}

interface Herbivore{
    void eating();
}
interface Carnivore{
    void hunting();
}

class Bear implements Herbivore,Carnivore{
    public void eating(){
        System.out.println("Eating grass");
    }
    public void hunting(){
        System.out.println("Hunting for eating meat");
    }
}