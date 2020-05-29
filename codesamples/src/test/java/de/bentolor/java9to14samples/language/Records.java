package de.bentolor.java9to14samples.language;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;

class Records {

    final BigDecimal testAmount = new BigDecimal(400);
    final Currency testCurrency = Currency.getInstance("USD");

    @Test
    void testRecord() {
        var balClass = new BalanceClass(testAmount, testCurrency);
        var balClass2 = new BalanceClass(testAmount, testCurrency);
        System.out.println( balClass);
        assertEquals(balClass,balClass2);

        var balRecord = new BalanceRecord(testAmount, testCurrency);
        var balRecord2 = new BalanceRecord(testAmount, testCurrency);
        System.out.println( balRecord);
        assertEquals(balRecord,balRecord2);

        assertEquals(balClass.amount(), balRecord.amount());
    }

    @Test
    void illustrateRecord() {
        var  amnt = new BigDecimal(400);
        var  curr = Currency.getInstance("USD");

        var bal = new BalanceRecord(amnt, curr);
        var bal2 = new BalanceRecord(amnt, curr);

        assertEquals(bal, bal2);
        assertEquals(bal.hashCode(), bal2.hashCode());
        assertEquals(amnt, bal.amount());
        assertEquals("BalanceRecord[amount=400, currency=USD]", bal.toString());
    }

    @Test
    void advancedRecordUsage() {
        var  amnt = new BigDecimal(400);
        var  curr = Currency.getInstance("EUR");
        var bal = new BalanceRecord(amnt, curr);

        assertEquals(BalanceRecord.eur("400"), bal);
        assertEquals(curr, BalanceRecord.EUR);

        var oneDollar = new BalanceRecord(BigDecimal.ONE);
    }

}
