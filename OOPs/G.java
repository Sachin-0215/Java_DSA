public class G{
    public static void main(String[] args) {
        fish f=new fish();
        mammal m = new mammal();
        // bird b=new mammal();error: incompatible types: mammal cannot be converted to bird
        bird b =new bird();
        f.swim();
        m.walking();
        b.fly();                
    }
}

//hierachical inheritance
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

//derived class 1
class fish extends Animal{
    int  finns;
    void swim(){
        System.out.println("Swimming..");
    }
}

//derived class 2
class mammal extends Animal{
    void walking(){
        System.out.println("Walking...");
    }
}
//derived class 3
class bird extends Animal{
    void fly(){
        System.out.println("Flying...");
    }
}
