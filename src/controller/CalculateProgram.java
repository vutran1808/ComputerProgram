/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.CalculateManager;
import repository.ICalculateManager;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class CalculateProgram extends Menu {

    private ICalculateManager mn;
    static String[] mc = {"Normal Calculator", "BMI Calculator", "Exit"};

    public CalculateProgram() {
        super("Calculator Program", mc);
        mn = new CalculateManager();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> mn.calculate();
            case 2 -> mn.calculateBMI();
        }
    }

}
