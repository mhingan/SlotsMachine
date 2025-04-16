package org.example;

import example.User;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class UserTests {

    Random rand = new Random();
    double walletValue = rand.nextDouble();

    User user = new User(walletValue);

    @Test
    public void testGetWalletValue() {
        try{
            assertEquals(walletValue, user.getWallet(), 0.0001);
            System.out.println("Test: getWalletValue: Success");
        } catch (Exception e){
            System.out.println("Eroare: testGetWalletValue: " + e.getMessage());
        }
    }

    @Test
    public void testSetWalletValue() {
        try{
            double newWalletValue = rand.nextDouble();
            user.setWallet(newWalletValue);
            assertEquals(newWalletValue, user.getWallet(), 0.0001);
            System.out.println("Test: setWalletValue: Success");
        } catch (Exception e){
            System.out.println("Eroare: testSetWalletValue: " + e.getMessage());
        }
    }


}
