/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ScannerFactory {

    private Scanner SCANNER;

    public Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public int getInt() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[\\d]+")) {
                break;
            }
        }
        return Integer.parseInt(input);
    }

    public String getYN() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[YyNn]")) {
                break;
            }
        }
        return input;
    }

    public double getNumber(String title) {
        String doublePattern = "[0-9]+(\\.){0,1}[0-9]*";
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (!input.isEmpty()) {
                if (input.matches(doublePattern) || input.matches("\\d+")) {
                    break;
                } else {
                    System.out.println("Input number");
                }
            } else {
                System.out.println("Not a space");
            }
        }
        return Double.parseDouble(input);
    }

    public char getOperation() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (!input.isEmpty()) {
                if (input.matches("[-+*/=]")) {
                    break;
                } else {
                    System.out.println("Input only one ( + - * / = )");
                }
            }else {
                System.out.println("Not Blank");
            }
        }
        return input.charAt(0);

    }
}
