import java.util.Arrays;

public class SelectNumbers {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java SelectNumbers <num1> <num2> <num3>");
            return;
        }

        int[] numbers = new int[3];

        try {
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: todos los argumentos deben ser enteros.");
            return;
        }

        Arrays.sort(numbers);

        System.out.printf("%d, %d, %d%n", numbers[2], numbers[1], numbers[0]);
    }
}