public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
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

    public double division(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception: can't " + e.getMessage());
            return -1;
        }
    }
}
