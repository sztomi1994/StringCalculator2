/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringcalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toooooomi
 */
public class StringCalculator {

    private String Default_Separator = ",";
    private String separator;

    String message = "Negatives not allowed: ";

    public StringCalculator() {
        separator = Default_Separator;
    }

    public StringCalculator(String separator) {
        this.separator = separator;
    }

    public int add(String numbers) {
        int szam, osszeg = 0;
        if (numbers.isEmpty()) {

            return 0;
        }
        String[] numberArray = numbers.split(separator);
        for (String numberArray1 : numberArray) {
            szam = Integer.valueOf(numberArray1);
            if (szam < 0) {
                message += szam + ",";
            } else {
                osszeg += szam;
            }
        }

        if (message != "") {
            try {
                throw new NegativesNotAllowed(message);
            } catch (NegativesNotAllowed ex) {
                Logger.getLogger(StringCalculator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return osszeg;
    }

}
