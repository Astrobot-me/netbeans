public class GCD {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        int gcd = 1;

        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
