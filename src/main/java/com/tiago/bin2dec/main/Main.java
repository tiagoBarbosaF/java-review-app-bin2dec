package com.tiago.bin2dec.main;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        while (true) {
            menu();

            System.out.print("\nEnter your option: ");
            String option = scanner.nextLine();

            if (option.equals("0"))
                break;

            switch (option) {
                case "1":
                    System.out.print("\nEnter your binary code: ");
                    String binary = scanner.nextLine();

                    if (binary.matches("\\d+") && binary.matches("[01]+")) {
                        System.out.printf("Your binary: \u001B[32m%s\u001B[0m " +
                                          "- Result Decimal: \u001B[32m%d\u001B[0m%n", binary,
                                bin2Dec(binary));
                        break;
                    }

                    System.out.println("Invalid characters, please enter only numbers of type 0 or 1.");
                    break;
                case "2":
                    System.out.print("\nEnter you decimal: ");
                    binary = scanner.nextLine();

                    if (binary.matches("\\d+")) {
                        int binaryInt = Integer.parseInt(binary);
                        System.out.printf("Your decimal: \u001B[32m%s\u001B[0m " +
                                          "- Result Binary: \u001B[32m%s\u001B[0m%n", binaryInt, dec2Bin(binaryInt));
                        break;
                    }

                    System.out.println("Invalid characters, please enter only numbers of type 0 or 1.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

        }
    }

    private static String dec2Bin(int binaryInt) {
        StringBuilder stringBuilder = new StringBuilder();
        while (binaryInt > 0) {
            stringBuilder.append(binaryInt % 2);
            binaryInt /= 2;
        }

        return stringBuilder.reverse().toString();
    }

    private static int bin2Dec(String binary) {
        double result = 0;

        for (int i = 0; i < binary.length(); i++) {
            int bitValue = binary.charAt(i) - '0';
            result += bitValue * Math.pow(2, (binary.length() - i) - 1);
        }

        return Double.valueOf(result).intValue();
    }

    private static void menu() {
        String menuBar = String.valueOf('*').repeat(20);

        System.out.println();
        System.out.println(menuBar);
        System.out.println("== Choose your converter ==");
        System.out.println(" 1 - Binary to Decimal");
        System.out.println(" 2 - Decimal to Binary");
        System.out.println(" 0 - Exit");
        System.out.println(menuBar);
    }


}
