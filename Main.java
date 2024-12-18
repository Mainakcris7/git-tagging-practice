public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition of 10 and 5 " + calculator.add(10, 5));
        System.out.println("Subtraction of 7 and 4 " + calculator.subtraction(10, 5));
        System.out.println("Multiplication of 2 and 3 " + calculator.multiply(2, 3));
        System.out.println("Division of 8 and 2 " + calculator.division(8, 2));
    }
}