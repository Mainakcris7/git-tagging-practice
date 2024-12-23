public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        System.out.println(a + " - " + b);
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception: can't " + e.getMessage());
            return -1;
        }
    }
}
