/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringcalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toooooomi
 */
public class Main {

    
    private static int eredmeny;
    private static String separator;
    

    public static void main(String... ergs) {
        start();

    }

    private static void start() {
        StringCalculator kalkulator = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Separator:");
        
        try {
            separator = reader.readLine();
            if (separator.isEmpty()) {
                kalkulator = new StringCalculator();
            } else {
                kalkulator=new StringCalculator(separator);
            }

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\nResult:" + kalkulator.add("5,23,64,23,-65"));
      
        
        
    }
}
