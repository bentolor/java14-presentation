package de.bentolor.java9to14samples.language;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public record BalanceRecord(BigDecimal amount, Currency currency) {
    public BalanceRecord {
        Objects.requireNonNull(amount);
        Objects.requireNonNull(currency);
    }

    public BalanceRecord(BigDecimal amount) {
        this(amount, USD);
    }

    static Currency EUR = Currency.getInstance("EUR");
    static Currency USD = Currency.getInstance("USD");

    public static BalanceRecord eur(String cash) {
        return new BalanceRecord(new BigDecimal(cash), EUR);
    }
}
