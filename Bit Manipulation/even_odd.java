// import java.util.*;

public class even_odd {
    public static void find_odd_Even(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.print("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]) {
        find_odd_Even(9);
        find_odd_Even(10);
    }
}
