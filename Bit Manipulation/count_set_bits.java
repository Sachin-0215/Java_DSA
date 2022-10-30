public class count_set_bits {
    public static int count_set_bit(int n) {
        int count = 0;
        while (n > 0) {//1111
            if ((n & (1 >> 0)) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count_set_bit(13));
        System.out.println(count_set_bit(23));

    }
}
