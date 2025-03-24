public class SelectNumbers {
    public static int numero = 42;

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + ", " + b + ", " + c);
            } else {
                System.out.println(a + ", " + c + ", " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + ", " + a + ", " + c);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        } else {
            if (a >= b) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }

        System.exit(0);
    }
}