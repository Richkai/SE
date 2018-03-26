/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahel12
 */
public class CalculatorModel {
    public int calculationValue = 0;
    
    public int addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
        return calculationValue;
    }
 
    public int getCalculationValue(){
        return calculationValue;
    }
}
