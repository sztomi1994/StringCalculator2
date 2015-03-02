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
        return 0;
    }
}
