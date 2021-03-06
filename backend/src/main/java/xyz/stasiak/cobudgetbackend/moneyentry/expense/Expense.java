package xyz.stasiak.cobudgetbackend.moneyentry.expense;

import xyz.stasiak.cobudgetbackend.moneyentry.EntryBadRequestException;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Objects;

public class Expense {

    private int day;

    @DecimalMin(value = "0.0", message = "amount can't be negative")
    @Digits(integer = 15, fraction = 2, message = "amount can have max 2 decimal places")
    private BigDecimal amount;

    @NotBlank(message = "category is mandatory")
    private String category;

    @NotBlank(message = "subcategory is mandatory")
    private String subcategory;
    private String comment;

    public Expense() {
    }

    public Expense(int day, BigDecimal amount, String category, String subcategory) {
        this(day, amount, category, subcategory, null);
    }

    public Expense(int day, BigDecimal amount, String category, String subcategory, String comment) {
        this.day = day;
        this.amount = checkAmount(amount);
        this.category = category;
        this.subcategory = subcategory;
        this.comment = comment;
    }

    private BigDecimal checkAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new EntryBadRequestException("amount can't be negative");
        }
        return amount;
    }

    public int getDay() {
        return day;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Expense expense = (Expense) o;
        return getDay() == expense.getDay() && Objects.equals(getAmount(), expense.getAmount()) &&
               Objects.equals(getCategory(), expense.getCategory()) &&
               Objects.equals(getSubcategory(), expense.getSubcategory()) &&
               Objects.equals(getComment(), expense.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getAmount(), getCategory(), getSubcategory(), getComment());
    }
}
