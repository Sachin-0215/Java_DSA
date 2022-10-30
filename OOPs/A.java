public class A {
    public static void main(String[] args) {
        Pen p1 = new Pen();// pen object which is called as p1 . created in heap 
        //data member and func can be called using dot operator

        p1.color = "red";
        System.out.println(p1.color);

        p1.setColor("blue");
        System.out.println(p1.color);

        p1.tip = 5;
        System.out.println(p1.tip);

        p1.setTip(6);
        System.out.println(p1.tip);

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

