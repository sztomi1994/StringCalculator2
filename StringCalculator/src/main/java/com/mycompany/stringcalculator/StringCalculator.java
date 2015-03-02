/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringcalculator;

/**
 *
 * @author Toooooomi
 */
public class StringCalculator {

    private String Default_Separator = ",";
    private String separator;
    
    public StringCalculator() {
        separator = Default_Separator;
    }

    public StringCalculator(String separator) {
        this.separator = separator;
    }

    public int add(String numbers) {
        
        
        if (numbers.isEmpty()) {

            return 0;
        }
        String[] numberArray=numbers.split(separator);
        if (numberArray.length==1) {
            
            return Integer.parseInt(numberArray[0]);
        }
        if (numberArray.length==2) {
            return Integer.parseInt(numberArray[0])+Integer.parseInt(numberArray[1]);
        }
        return 0;
    }
}
