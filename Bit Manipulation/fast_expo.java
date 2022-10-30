public class fast_expo {
    public static int Fast_expo(int a, int n) {
        int ans = 1;
        while (n > 0) {//011   001
            if ((n & 1)!=0) {
                ans *= a;//1x5=5  5x25=125
            }
            a *= a;//25 625
            n >>= 1;//001  000
        }
        return ans;//125
    }
    public static void main(String[] args) {
        System.out.println(Fast_expo(5, 4));
        System.out.println(Fast_expo(100,3));

    }
}
