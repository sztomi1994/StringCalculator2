/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.stringcalculator.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toooooomi
 */
public class StringCalculatorTest {

    private StringCalculator kalkulator = new StringCalculator();

    @Test
    public void IfStringIsEmpty() {
        assertEquals(0, kalkulator.add(""));
    }

    @Test
    public void OneNumber() {
        assertEquals(1, kalkulator.add("1"));
        assertEquals(2, kalkulator.add("2"));
    }

    @Test
    public void TwoNumber() {   
        assertEquals(4, kalkulator.add("1,3"));
        assertEquals(14, kalkulator.add("10,4"));
         }

    @Test
    public void MoreNumber() {
        assertEquals(10, kalkulator.add("1,3,1,5"));
        assertEquals(35, kalkulator.add("10,4,5,12,4"));
         }

    @Test
    public void Separators() {
        kalkulator = new StringCalculator(";");
        assertEquals(3, kalkulator.add("0;2"));

        kalkulator = new StringCalculator("\n");
        assertEquals(8, kalkulator.add("3\n5"));

        kalkulator = new StringCalculator("\t");
        assertEquals(6, kalkulator.add("4\t2"));

    }

}
