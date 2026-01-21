package com.example.adder;

public class App {
    public static void main(String[] args) {

        // Check correct input
        if (args.length < 3) {
            System.out.println(" Usage: java App <operation> <num1> <num2>");
            System.out.println("Example: java App add 10 20");
            System.out.println("Operations: add, sub, mul, div");
            return;
        }

        String operation = args[0];

        try {
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);

            switch (operation.toLowerCase()) {

                case "add":
                    System.out.println("Sum is: " + (a + b));
                    break;

                case "sub":
                    System.out.println("Subtraction is: " + (a - b));
                    break;

                case "mul":
                    System.out.println("Multiplication is: " + (a * b));
                    break;

                case "div":
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("Division is: " + (a / b));
                    }
                    break;

                default:
                    System.out.println("Invalid operation!");
                    System.out.println("Use: add, sub, mul, div");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter only numbers.");
        }
    }
}
