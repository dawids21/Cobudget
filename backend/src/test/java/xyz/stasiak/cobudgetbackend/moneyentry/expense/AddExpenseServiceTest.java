package xyz.stasiak.cobudgetbackend.moneyentry.expense;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AddExpenseServiceTest {

    private final AddExpenseService addExpenseService = new TestExpenseConfig().addExpenseService();

    @Test
    void add_expense_to_current_month_monthly_expenses_entity_for_given_user() {
        //TODO implement add_expense_to_current_month_monthly_expenses_entity_for_given_user
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Test
    void add_expense_value_to_sum_of_expenses_in_monthly_expense() {
        //TODO implement add_expense_value_to_sum_of_expenses_in_monthly_expense
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Test
    void create_monthly_expenses_if_doesnt_exist_yet() {
        //TODO implement create_monthly_expenses_if_doesnt_exist_yet
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Test
    void reject_adding_when_day_is_out_of_range_for_given_month() {
        //TODO implement reject_adding_when_day_is_out_of_range_for_given_month
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Test
    void reject_adding_when_amount_is_negative() {
        //TODO implement reject_adding_when_amount_is_negative
        throw new UnsupportedOperationException("Not implemented yet");
    }
}