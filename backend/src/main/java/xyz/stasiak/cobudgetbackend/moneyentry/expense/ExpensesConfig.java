package xyz.stasiak.cobudgetbackend.moneyentry.expense;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExpensesConfig {

    @Bean
    public AddExpenseService addExpenseService() {
        return new AddExpenseService();
    }
}
