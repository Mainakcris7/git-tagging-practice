public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition of 10.2 and 5 is: " + calculator.add(10.2, 5));
        System.out.println("Subtraction of 10.2 and 8.3 is: " + calculator.subtraction(10.2, 8.3));
        System.out.println("Multiplication of 2.34 and 3 is: " + calculator.multiply(2.34, 3));
        System.out.println("Division of 8.5 and 0.5 is: " + calculator.division(8.5, 0.5));
    }
}