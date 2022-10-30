

public class power2 {
    public static boolean check_powerof_two(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(check_powerof_two(9));
        System.out.println(check_powerof_two(8));
        System.out.println(check_powerof_two(64));


    }
}
