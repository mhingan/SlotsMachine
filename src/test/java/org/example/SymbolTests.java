package org.example;

import example.Symbol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SymbolTests {
    Symbol symbol = new Symbol('A', 30, 33.2);

    @Test
    public void testSymbolValue() {
        try{
            assertEquals('A', symbol.getValue());
            System.out.println("Test: testSymbolValue - Success" );
        } catch (Exception e){
            System.out.println("Eroare: testSymbolValue: " + e.getMessage());
        }
    }

    @Test
    public void testSymbolWeight() {
        try{
            assertEquals(30, symbol.getWeight());
            System.out.println("Test: testSymbolWeight - Success" );
        } catch (Exception e){
            System.out.println("Eroare: testSymbolWeight : " + e.getMessage());
        }
    }

    @Test
    public void testSymbolMultiplier() {
        try{
            assertEquals(33.2, symbol.getMultiplier(), 0.001);
            System.out.println("Test: testSymbolMultiplier - Success" );
        } catch (Exception e){
            System.out.println("Eroare: testSymbolMultiplier : " + e.getMessage());
        }
    }
}
