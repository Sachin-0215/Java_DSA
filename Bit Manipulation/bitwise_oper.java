
public class bitwise_oper {
    // get ith bits
    public static int get_ith_bits(int n, int position) {
        int bitmask = (1 << position);
        if ((n & bitmask) == 0) {// 10000 1000 - 0000
            return 0;
        } else {
            return 1;
        }
    }

    // set ith bits
    public static int set_ith_bits(int n, int position) {
        int bitmask = 1 << position;
        return n | bitmask;
    }

    // clear ith bits
    public static int clear_ith_bits(int n, int position) {
        int bitmask = ~(1 << position);
        return n & bitmask;
    }

    // update ith bits
    public static int update_ith_bit(int n, int position, int newBit) {
        if (newBit == 0) {
            return clear_ith_bits(n, position);
        } else {// true
            return set_ith_bits(n, position);// 1110|0001=1111
        }

        // optimal approach
        /*
         * n = clear_ith_bits(n, position);//1110
         * int bitmask = newBit << position; //1
         * return n | bitmask;//1110|0001=1111
         */
    }

    // clear last i bits
    public static int clear_last_Ithbits(int n, int i) {
        int bitmask = (~0) << i;// 11111111
        return n & bitmask;// 1111&1100=1100
        // 1011&1000=1000
    }

    public static void main(String args[]) {
        System.out.println(get_ith_bits(16, 3));
        System.out.println(set_ith_bits(9, 2));// 1001 | 0100 1101
        System.out.println(clear_ith_bits(17, 0));// 10001 1110
        System.out.println(update_ith_bit(14, 0, 1));
        System.out.println(clear_last_Ithbits(11, 3));
    }

}
