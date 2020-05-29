package de.bentolor.java9to14samples.language;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

final class BalanceClass {
    final BigDecimal amount;
    final Currency currency;

    public BalanceClass(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal amount() {
        return amount;
    }

    public Currency currency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || (getClass() != o.getClass())) return false;
        BalanceClass that = (BalanceClass) o;
        return (amount.compareTo(that.amount) == 0) &&
                currency.equals(that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return "Balance[" +
                "amount=" + amount +
                ", currency=" + currency +
                ']';
    }
}
