public class C {
    public static void main(String[] args) {
        Pencil p = new Pencil();
        p.setColor("RED");
        p.setTip(5);

        // p.color = "BLUE"; private data member. Not accesible
        // p.tip = 5;private data member not accesible 

        System.out.println(p.getColor());
        System.out.println(p.getTip());
    }
}

//getter and setter
class Pencil {
    private String color;
    private int tip;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setTip(int Tip) {
        this.tip = Tip;
    }

    int getTip() {
        return this.tip;
    }


}