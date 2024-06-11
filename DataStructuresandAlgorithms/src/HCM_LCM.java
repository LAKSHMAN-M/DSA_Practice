
public class HCM_LCM {

    public static void main(String[] args) {

//		System.out.println(lcm(12, 24));
//		int lcm = lcm(12, 24) * hcf(12, 24);
//		System.out.println(lcm == 12 * 24);
        System.out.println(lcm(3, 12));

    }

    static int hcf(int a, int b) {

        if (a == 0) return b;
        return hcf(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }
}
