package com.teamtreehouse.vending;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidsudia on 4/9/16.
 */
public class CreditorTest {
    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception {
        Creditor creditor = new Creditor();

        creditor.addFunds(25);
        creditor.addFunds(25);

        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds() throws Exception {
        Creditor creditor = new Creditor();
        creditor.addFunds(10);

        int refund = creditor.refund();

        assertEquals(10, refund);
        assert
    }
}