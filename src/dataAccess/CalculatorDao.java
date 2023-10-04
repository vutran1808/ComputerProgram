/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.ScannerFactory;
import java.util.Stack;
import repository.CalculateManager;
import repository.ICalculateManager;

/**
 *
 * @author ASUS
 */
public class CalculatorDao {

    private static CalculatorDao instance = null;
    ICalculateManager mn;
    ScannerFactory sc;

    public CalculatorDao() {
        mn = new CalculateManager();
        sc = new ScannerFactory();
    }

    public static CalculatorDao Instance() {
        if (instance == null) {
            synchronized (CalculatorDao.class) {
                if (instance == null) {
                    instance = new CalculatorDao();
                }
            }
        }
        return instance;
    }

    public void normalCalculator() {
        System.out.println("-----Normal Calculator-----");
        double temp, memory;
        char operator;
        memory = sc.getNumber("Enter number: ");
        while (true) {
            System.out.println("Enter operator: ");
            operator = sc.getOperation();
            if (String.valueOf(operator).equals("=")) {
                System.out.println("Memory: " + memory);
                return;
            }
            temp = sc.getNumber("Enter number");
            switch (operator) {
                case '+' -> {
                    memory += temp;
                    System.out.println("Memory: " + memory);
                }
                case '-' -> {
                    memory -= temp;
                    System.out.println("Memory: " + memory);
                }
                case '*' -> {
                    memory *= temp;
                    System.out.println("Memory: " + memory);
                }
                case '^' -> {
                    memory = Math.pow(memory, temp);
                    System.out.println("Memory: " + memory);
                }
                case '/' -> {
                    if (temp == 0) {
                        System.out.println("Divided by 0");
                    } else {
                        memory /= temp;
                        System.out.println("Memory: " + memory);
                    }
                }
            }

        }
    }

    public void BMICalculator() {
        System.out.println("-----BMI Calculator-----");
        double weight = sc.getNumber("Enter Weight(kg)");
        double height = sc.getNumber("Enter Height(cm)");
        double bmi = weight / Math.pow((height / 100), 2);
        System.out.println("BMI Number: " + Math.ceil(bmi));
        statusBody(bmi);
    }

    public void statusBody(double bmi) {
        if (bmi < 19) {
            System.out.println("Under-standard");
        } else if (bmi > 19 && bmi < 25) {
            System.out.println("Standard");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi > 30 && bmi < 40) {
            System.out.println("Fat - Should lose weight");
        } else {
            System.out.println("Very fat - Should lose weight immediately");
        }
    }

}
