/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.CalculatorDao;

/**
 *
 * @author ASUS
 */
public class CalculateManager implements ICalculateManager {

    @Override
    public void calculate() {
        CalculatorDao.Instance().normalCalculator();
    }

    @Override
    public void calculateBMI() {
        CalculatorDao.Instance().BMICalculator();
    }

}
